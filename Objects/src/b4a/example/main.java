package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtelemento = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttipo = null;
public anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper _acttipo = null;
public anywheresoftware.b4a.objects.collections.Map _tiposwyverns = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="CargarTiposDeWyvern";
_cargartiposdewyvern();
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="End Sub";
return "";
}
public static void  _cargartiposdewyvern() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargartiposdewyvern", false))
	 {Debug.delegate(mostCurrent.activityBA, "cargartiposdewyvern", null); return;}
ResumableSub_CargarTiposDeWyvern rsub = new ResumableSub_CargarTiposDeWyvern(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CargarTiposDeWyvern extends BA.ResumableSub {
public ResumableSub_CargarTiposDeWyvern(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;
b4a.example.httpjob _peticion = null;
b4a.example.httpjob _respuesta = null;
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.List _listatipos = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _tipo = null;
anywheresoftware.b4a.BA.IterableList group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="peticion.Initialize(\"JobTiposDeWyvern\", Me)";
_peticion._initialize /*String*/ (null,processBA,"JobTiposDeWyvern",main.getObject());
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
_peticion._download /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern");
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "cargartiposdewyvern"), (Object)(_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_respuesta = (b4a.example.httpjob) result[0];
;
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_respuesta._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="Dim json As String = respuesta.GetString";
_json = _respuesta._getstring /*String*/ (null);
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="jsonParser.Initialize(json)";
_jsonparser.Initialize(_json);
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Dim listaTipos As List = jsonParser.NextArray";
_listatipos = new anywheresoftware.b4a.objects.collections.List();
_listatipos = _jsonparser.NextArray();
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="tiposWyverns.Initialize";
parent.mostCurrent._tiposwyverns.Initialize();
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="For Each tipo As Map In listaTipos";
if (true) break;

case 4:
//for
this.state = 7;
_tipo = new anywheresoftware.b4a.objects.collections.Map();
group13 = _listatipos;
index13 = 0;
groupLen13 = group13.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index13 < groupLen13) {
this.state = 6;
_tipo = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group13.Get(index13)));}
if (true) break;

case 13:
//C
this.state = 12;
index13++;
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="tiposWyverns.Put(tipo.Get(\"id\"), tipo.Get(\"Nomb";
parent.mostCurrent._tiposwyverns.Put(_tipo.Get((Object)("id")),_tipo.Get((Object)("Nombre")));
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="items.Add(tipo.Get(\"Nombre\"))";
_items.Add(_tipo.Get((Object)("Nombre")));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=4849685;
 //BA.debugLineNum = 4849685;BA.debugLine="actTipo.SetItems(items)";
parent.mostCurrent._acttipo.SetItems(processBA,_items);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=4849687;
 //BA.debugLineNum = 4849687;BA.debugLine="MsgboxAsync(\"No se pudo obtener la lista de tipo";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("No se pudo obtener la lista de tipos de wyvern. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),processBA);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=4849690;
 //BA.debugLineNum = 4849690;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=4849691;
 //BA.debugLineNum = 4849691;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static void  _btnbuscar_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbuscar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnbuscar_click", null); return;}
ResumableSub_btnBuscar_Click rsub = new ResumableSub_btnBuscar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnBuscar_Click extends BA.ResumableSub {
public ResumableSub_btnBuscar_Click(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;
int _id = 0;
b4a.example.httpjob _peticion = null;
b4a.example.httpjob _respuesta = null;
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _tipowyvernid = "";
String _tipowyvernnombre = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim Id As Int";
_id = 0;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Id = txtId.Text";
_id = (int)(Double.parseDouble(parent.mostCurrent._txtid.getText()));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="MsgboxAsync(\"El Id debe ser numérico.\", \"Error\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("El Id debe ser numérico."),BA.ObjectToCharSequence("Error"),processBA);
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="Return";
if (true) return ;
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="peticion.Initialize(\"\", Me)";
_peticion._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
_peticion._download /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"+BA.NumberToString(_id));
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnbuscar_click"), (Object)(_peticion));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_respuesta = (b4a.example.httpjob) result[0];
;
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_respuesta._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="json = respuesta.GetString";
_json = _respuesta._getstring /*String*/ (null);
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="jsonParser.Initialize(json)";
_jsonparser.Initialize(_json);
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="txtId.Text = map.Get(\"id\")";
parent.mostCurrent._txtid.setText(BA.ObjectToCharSequence(_map.Get((Object)("id"))));
RDebugUtils.currentLine=393242;
 //BA.debugLineNum = 393242;BA.debugLine="txtNombre.Text = map.Get(\"Nombre\")";
parent.mostCurrent._txtnombre.setText(BA.ObjectToCharSequence(_map.Get((Object)("Nombre"))));
RDebugUtils.currentLine=393243;
 //BA.debugLineNum = 393243;BA.debugLine="txtElemento.Text = map.Get(\"Elemento\")";
parent.mostCurrent._txtelemento.setText(BA.ObjectToCharSequence(_map.Get((Object)("Elemento"))));
RDebugUtils.currentLine=393244;
 //BA.debugLineNum = 393244;BA.debugLine="txtTipo.Text = map.Get(\"Tipo_WyvernId\")";
parent.mostCurrent._txttipo.setText(BA.ObjectToCharSequence(_map.Get((Object)("Tipo_WyvernId"))));
RDebugUtils.currentLine=393246;
 //BA.debugLineNum = 393246;BA.debugLine="Dim tipoWyvernId As String = map.Get(\"Tipo_Wyver";
_tipowyvernid = BA.ObjectToString(_map.Get((Object)("Tipo_WyvernId")));
RDebugUtils.currentLine=393247;
 //BA.debugLineNum = 393247;BA.debugLine="Dim tipoWyvernNombre As String = tiposWyverns.Ge";
_tipowyvernnombre = BA.ObjectToString(parent.mostCurrent._tiposwyverns.Get((Object)(_tipowyvernid)));
RDebugUtils.currentLine=393248;
 //BA.debugLineNum = 393248;BA.debugLine="actTipo.Text = tipoWyvernNombre";
parent.mostCurrent._acttipo.setText(BA.ObjectToCharSequence(_tipowyvernnombre));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=393251;
 //BA.debugLineNum = 393251;BA.debugLine="MsgboxAsync(\"No se pudo obtener la información d";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("No se pudo obtener la información del wyvern. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),processBA);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=393254;
 //BA.debugLineNum = 393254;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=393256;
 //BA.debugLineNum = 393256;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static void  _btneditar_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btneditar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btneditar_click", null); return;}
ResumableSub_btnEditar_Click rsub = new ResumableSub_btnEditar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnEditar_Click extends BA.ResumableSub {
public ResumableSub_btnEditar_Click(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;
String _tipo = "";
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
b4a.example.httpjob _peticion = null;
b4a.example.httpjob _respuesta = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="If txtId.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent.mostCurrent._txtid.getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="MsgboxAsync(\"El ID es necesario para actualizar.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("El ID es necesario para actualizar."),BA.ObjectToCharSequence("Error"),processBA);
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="Dim tipo As String = GetKeyFromValue(tiposWyverns";
_tipo = _getkeyfromvalue(parent.mostCurrent._tiposwyverns,parent.mostCurrent._acttipo.getText());
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="If tipo = \"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_tipo).equals("")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="MsgboxAsync(\"Tipo de Wyvern no válido.\", \"Error\"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Tipo de Wyvern no válido."),BA.ObjectToCharSequence("Error"),processBA);
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="peticion.Initialize(\"jobUpdate\", Me)";
_peticion._initialize /*String*/ (null,processBA,"jobUpdate",main.getObject());
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="map.Put(\"id\", txtId.Text)";
_map.Put((Object)("id"),(Object)(parent.mostCurrent._txtid.getText()));
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="map.Put(\"Nombre\", txtNombre.Text)";
_map.Put((Object)("Nombre"),(Object)(parent.mostCurrent._txtnombre.getText()));
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="map.Put(\"Elemento\", txtElemento.Text)";
_map.Put((Object)("Elemento"),(Object)(parent.mostCurrent._txtelemento.getText()));
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="map.Put(\"Tipo_WyvernId\", tipo)";
_map.Put((Object)("Tipo_WyvernId"),(Object)(_tipo));
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="jsonGenerator.Initialize(map)";
_jsongenerator.Initialize(_map);
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="json = jsonGenerator.ToString";
_json = _jsongenerator.ToString();
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="peticion.PutString(\"https://6637fe834253a866a24c8";
_peticion._putstring /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"+parent.mostCurrent._txtid.getText(),_json);
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="peticion.GetRequest.SetContentType(\"application/j";
_peticion._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=524324;
 //BA.debugLineNum = 524324;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btneditar_click"), (Object)(_peticion));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_respuesta = (b4a.example.httpjob) result[0];
;
RDebugUtils.currentLine=524325;
 //BA.debugLineNum = 524325;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_respuesta._success /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=524326;
 //BA.debugLineNum = 524326;BA.debugLine="MsgboxAsync(\"Actualizado!\", \"Éxito\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Actualizado!"),BA.ObjectToCharSequence("Éxito"),processBA);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=524328;
 //BA.debugLineNum = 524328;BA.debugLine="MsgboxAsync(\"No se pudo actualizar. \" & respuest";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("No se pudo actualizar. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),processBA);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=524330;
 //BA.debugLineNum = 524330;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=524331;
 //BA.debugLineNum = 524331;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _getkeyfromvalue(anywheresoftware.b4a.objects.collections.Map _map,String _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getkeyfromvalue", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getkeyfromvalue", new Object[] {_map,_value}));}
int _i = 0;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub GetKeyFromValue(map As Map, value As S";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="For i = 0 To map.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_map.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="If map.GetValueAt(i) = value Then";
if ((_map.GetValueAt(_i)).equals((Object)(_value))) { 
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Return map.GetKeyAt(i)";
if (true) return BA.ObjectToString(_map.GetKeyAt(_i));
 };
 }
};
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="End Sub";
return "";
}
public static void  _btneliminar_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btneliminar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btneliminar_click", null); return;}
ResumableSub_btnEliminar_Click rsub = new ResumableSub_btnEliminar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnEliminar_Click extends BA.ResumableSub {
public ResumableSub_btnEliminar_Click(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;
int _wyvernid = 0;
int _tipoid = 0;
b4a.example.httpjob _peticion = null;
String _url = "";
b4a.example.httpjob _respuesta = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="If txtId.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent.mostCurrent._txtid.getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="MsgboxAsync(\"Debes ingresar el ID del wyvern par";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Debes ingresar el ID del wyvern para eliminarlo."),BA.ObjectToCharSequence("Error"),processBA);
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="If txtTipo.Text.Trim = \"\" Then";

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._txttipo.getText().trim()).equals("")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="MsgboxAsync(\"Debes ingresar el ID del tipo de wy";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Debes ingresar el ID del tipo de wyvern para eliminarlo."),BA.ObjectToCharSequence("Error"),processBA);
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="Dim wyvernId As Int";
_wyvernid = 0;
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="Dim tipoId As Int";
_tipoid = 0;
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="Try";
if (true) break;

case 8:
//try
this.state = 13;
this.catchState = 12;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 13;
this.catchState = 12;
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="wyvernId = txtId.Text";
_wyvernid = (int)(Double.parseDouble(parent.mostCurrent._txtid.getText()));
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="tipoId = txtTipo.Text";
_tipoid = (int)(Double.parseDouble(parent.mostCurrent._txttipo.getText()));
 if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="MsgboxAsync(\"Los IDs deben ser numéricos.\", \"Err";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Los IDs deben ser numéricos."),BA.ObjectToCharSequence("Error"),processBA);
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="Return";
if (true) return ;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
;
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=327703;
 //BA.debugLineNum = 327703;BA.debugLine="peticion.Initialize(\"jobDelete\", Me)";
_peticion._initialize /*String*/ (null,processBA,"jobDelete",main.getObject());
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="Dim url As String = \"https://6637fe834253a866a24c";
_url = "https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"+BA.NumberToString(_tipoid)+"/Wyverns/"+BA.NumberToString(_wyvernid);
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="Log(\"URL de la solicitud DELETE: \" & url)";
anywheresoftware.b4a.keywords.Common.LogImpl("1327707","URL de la solicitud DELETE: "+_url,0);
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="peticion.Delete(url)";
_peticion._delete /*String*/ (null,_url);
RDebugUtils.currentLine=327713;
 //BA.debugLineNum = 327713;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btneliminar_click"), (Object)(_peticion));
this.state = 20;
return;
case 20:
//C
this.state = 14;
_respuesta = (b4a.example.httpjob) result[0];
;
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_respuesta._success /*boolean*/ ) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=327715;
 //BA.debugLineNum = 327715;BA.debugLine="MsgboxAsync(\"Wyvern eliminado!\", \"Éxito\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Wyvern eliminado!"),BA.ObjectToCharSequence("Éxito"),processBA);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=327717;
 //BA.debugLineNum = 327717;BA.debugLine="Log(\"Error: \" & respuesta.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("1327717","Error: "+_respuesta._errormessage /*String*/ ,0);
RDebugUtils.currentLine=327718;
 //BA.debugLineNum = 327718;BA.debugLine="Log(\"Respuesta: \" & respuesta.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("1327718","Respuesta: "+_respuesta._getstring /*String*/ (null),0);
RDebugUtils.currentLine=327719;
 //BA.debugLineNum = 327719;BA.debugLine="MsgboxAsync(\"No se pudo eliminar. \" & respuesta.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("No se pudo eliminar. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),processBA);
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=327722;
 //BA.debugLineNum = 327722;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=327723;
 //BA.debugLineNum = 327723;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static void  _btninsertar_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btninsertar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btninsertar_click", null); return;}
ResumableSub_btnInsertar_Click rsub = new ResumableSub_btnInsertar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnInsertar_Click extends BA.ResumableSub {
public ResumableSub_btnInsertar_Click(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
String _nombre = "";
String _elemento = "";
String _tipo = "";
b4a.example.httpjob _peticion = null;
b4a.example.httpjob _respuesta = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Dim nombre As String = txtNombre.Text";
_nombre = parent.mostCurrent._txtnombre.getText();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Dim elemento As String = txtElemento.Text";
_elemento = parent.mostCurrent._txtelemento.getText();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Dim tipo As String = GetKeyFromValue(tiposWyverns";
_tipo = _getkeyfromvalue(parent.mostCurrent._tiposwyverns,parent.mostCurrent._acttipo.getText());
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="If tipo = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_tipo).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="MsgboxAsync(\"Tipo de Wyvern no válido.\", \"Error\"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Tipo de Wyvern no válido."),BA.ObjectToCharSequence("Error"),processBA);
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="map.Put(\"Nombre\", nombre)";
_map.Put((Object)("Nombre"),(Object)(_nombre));
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="map.Put(\"Elemento\", elemento)";
_map.Put((Object)("Elemento"),(Object)(_elemento));
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="map.Put(\"Tipo_WyvernId\", tipo)";
_map.Put((Object)("Tipo_WyvernId"),(Object)(_tipo));
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="jsonGenerator.Initialize(map)";
_jsongenerator.Initialize(_map);
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="json = jsonGenerator.ToPrettyString(2)";
_json = _jsongenerator.ToPrettyString((int) (2));
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="Dim peticion As HttpJob";
_peticion = new b4a.example.httpjob();
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="peticion.Initialize(\"jobInsertar\", Me)";
_peticion._initialize /*String*/ (null,processBA,"jobInsertar",main.getObject());
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="peticion.PostString(\"https://6637fe834253a866a24c";
_peticion._poststring /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/",_json);
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="peticion.GetRequest.SetContentType(\"application/j";
_peticion._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btninsertar_click"), (Object)(_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_respuesta = (b4a.example.httpjob) result[0];
;
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_respuesta._success /*boolean*/ ) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="MsgboxAsync(\"Wyvern creado.\", \"Éxito\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Wyvern creado."),BA.ObjectToCharSequence("Éxito"),processBA);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=458787;
 //BA.debugLineNum = 458787;BA.debugLine="MsgboxAsync(\"No se pudo crear wyvern. \" & respue";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("No se pudo crear wyvern. "+_respuesta._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),processBA);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=458791;
 //BA.debugLineNum = 458791;BA.debugLine="peticion.Release";
_peticion._release /*String*/ (null);
RDebugUtils.currentLine=458792;
 //BA.debugLineNum = 458792;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}