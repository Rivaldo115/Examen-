package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class retrofitclient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.retrofitclient");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.retrofitclient.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.retrofitclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="retrofitclient";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.retrofitclient __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="retrofitclient";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
}