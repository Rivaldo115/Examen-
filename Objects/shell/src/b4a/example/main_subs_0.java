package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"layout2\")";
Debug.ShouldStop(268435456);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layout2")),main.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbuscar_click() throws Exception{
try {
		Debug.PushSubsStack("btnBuscar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("btnbuscar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnbuscar_click");}
RemoteObject _id = RemoteObject.createImmutable("");
 BA.debugLineNum = 50;BA.debugLine="Private Sub btnBuscar_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Dim id As String = txtId.Text";
Debug.ShouldStop(262144);
_id = main.mostCurrent._txtid.runMethod(true,"getText");Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 52;BA.debugLine="tipoWyvernRepo.ReadTipoWyvernById(id)";
Debug.ShouldStop(524288);
main._tipowyvernrepo.runClassMethod (b4a.example.tipowyvernrepository.class, "_readtipowyvernbyid" /*RemoteObject*/ ,(Object)(_id));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btneditar_click() throws Exception{
try {
		Debug.PushSubsStack("btnEditar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("btneditar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btneditar_click");}
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _nombre = RemoteObject.createImmutable("");
 BA.debugLineNum = 61;BA.debugLine="Private Sub btnEditar_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim id As String = txtId.Text";
Debug.ShouldStop(536870912);
_id = main.mostCurrent._txtid.runMethod(true,"getText");Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 63;BA.debugLine="Dim nombre As String = txtNombre.Text";
Debug.ShouldStop(1073741824);
_nombre = main.mostCurrent._txtnombre.runMethod(true,"getText");Debug.locals.put("nombre", _nombre);Debug.locals.put("nombre", _nombre);
 BA.debugLineNum = 64;BA.debugLine="CallSub2(tipoWyvernRepo, \"UpdateTipoWyvern\", Arra";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",main.processBA,(Object)((main._tipowyvernrepo)),(Object)(BA.ObjectToString("UpdateTipoWyvern")),(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {_id,_nombre}))));
 BA.debugLineNum = 65;BA.debugLine="Msgbox(\"Registro actualizado\", \"ok\")";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ok"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btneliminar_click() throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,42);
if (RapidSub.canDelegate("btneliminar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btneliminar_click");}
RemoteObject _id = RemoteObject.createImmutable("");
 BA.debugLineNum = 42;BA.debugLine="Private Sub btnEliminar_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim id As String = txtId.Text";
Debug.ShouldStop(1024);
_id = main.mostCurrent._txtid.runMethod(true,"getText");Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 44;BA.debugLine="tipoWyvernRepo.DeleteTipoWyvern(id)";
Debug.ShouldStop(2048);
main._tipowyvernrepo.runClassMethod (b4a.example.tipowyvernrepository.class, "_deletetipowyvern" /*void*/ ,(Object)(_id));
 BA.debugLineNum = 45;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(4096);
main.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 46;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(8192);
main.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 47;BA.debugLine="Msgbox(\"Registro borrado\", \"ok\")";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro borrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ok"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btninsertar_click() throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("btninsertar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btninsertar_click");}
RemoteObject _nombre = RemoteObject.createImmutable("");
 BA.debugLineNum = 55;BA.debugLine="Private Sub btnInsertar_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim nombre As String = txtNombre.Text";
Debug.ShouldStop(8388608);
_nombre = main.mostCurrent._txtnombre.runMethod(true,"getText");Debug.locals.put("nombre", _nombre);Debug.locals.put("nombre", _nombre);
 BA.debugLineNum = 57;BA.debugLine="CallSubDelayed2(tipoWyvernRepo, \"CreateTipoWyvern";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",main.processBA,(Object)((main._tipowyvernrepo)),(Object)(BA.ObjectToString("CreateTipoWyvern")),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {main.mostCurrent._txtnombre.runMethod(true,"getText")}))));
 BA.debugLineNum = 58;BA.debugLine="Msgbox(\"Tipo Wyvern ingresado\", \"ok\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Tipo Wyvern ingresado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ok"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filltipowyverndetails(RemoteObject _tipowyvern) throws Exception{
try {
		Debug.PushSubsStack("FillTipoWyvernDetails (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,68);
if (RapidSub.canDelegate("filltipowyverndetails")) { return b4a.example.main.remoteMe.runUserSub(false, "main","filltipowyverndetails", _tipowyvern);}
Debug.locals.put("tipoWyvern", _tipowyvern);
 BA.debugLineNum = 68;BA.debugLine="Sub FillTipoWyvernDetails(tipoWyvern As Map)";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="txtId.Text = tipoWyvern.Get(\"id\")";
Debug.ShouldStop(16);
main.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_tipowyvern.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 70;BA.debugLine="txtNombre.Text = tipoWyvern.Get(\"Nombre\")";
Debug.ShouldStop(32);
main.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_tipowyvern.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Private txtId As EditText";
main.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtNombre As EditText";
main.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private txtElemento As EditText";
main.mostCurrent._txtelemento = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtTipo As EditText";
main.mostCurrent._txttipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private tiposWyverns As List";
main.mostCurrent._tiposwyverns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
wyvern.myClass = BA.getDeviceClass ("b4a.example.wyvern");
wyverns.myClass = BA.getDeviceClass ("b4a.example.wyverns");
tipowyvern.myClass = BA.getDeviceClass ("b4a.example.tipowyvern");
retrofitclient.myClass = BA.getDeviceClass ("b4a.example.retrofitclient");
tipowyvernrepository.myClass = BA.getDeviceClass ("b4a.example.tipowyvernrepository");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 17;BA.debugLine="Private tipoWyvernRepo As TipoWyvernRepository";
main._tipowyvernrepo = RemoteObject.createNew ("b4a.example.tipowyvernrepository");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}