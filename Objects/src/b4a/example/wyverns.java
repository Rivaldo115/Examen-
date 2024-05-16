package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class wyverns extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.wyverns");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.wyverns.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper _httpclient = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.wyverns __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wyverns";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Private HttpClient As OkHttpClient";
_httpclient = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public String  _createjson(b4a.example.wyverns __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="wyverns";
if (Debug.shouldDelegate(ba, "createjson", false))
	 {return ((String) Debug.delegate(ba, "createjson", new Object[] {_params}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub CreateJson(Params As Map) As String";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="json.Initialize(Params)";
_json.Initialize(_params);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="Return json.ToString";
if (true) return _json.ToString();
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createwyvern(b4a.example.wyverns __ref,String _nombre,String _elemento,String _tipo_wyvernid) throws Exception{
RDebugUtils.currentModule="wyverns";
if (Debug.shouldDelegate(ba, "createwyvern", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "createwyvern", new Object[] {_nombre,_elemento,_tipo_wyvernid}));}
ResumableSub_CreateWyvern rsub = new ResumableSub_CreateWyvern(this,__ref,_nombre,_elemento,_tipo_wyvernid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateWyvern extends BA.ResumableSub {
public ResumableSub_CreateWyvern(b4a.example.wyverns parent,b4a.example.wyverns __ref,String _nombre,String _elemento,String _tipo_wyvernid) {
this.parent = parent;
this.__ref = __ref;
this._nombre = _nombre;
this._elemento = _elemento;
this._tipo_wyvernid = _tipo_wyvernid;
this.__ref = parent;
}
b4a.example.wyverns __ref;
b4a.example.wyverns parent;
String _nombre;
String _elemento;
String _tipo_wyvernid;
anywheresoftware.b4a.objects.collections.Map _params = null;
b4a.example.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="wyverns";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim Params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Params.Put(\"Nombre\", Nombre)";
_params.Put((Object)("Nombre"),(Object)(_nombre));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Params.Put(\"Elemento\", Elemento)";
_params.Put((Object)("Elemento"),(Object)(_elemento));
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Params.Put(\"Tipo_WyvernId\", Tipo_WyvernId)";
_params.Put((Object)("Tipo_WyvernId"),(Object)(_tipo_wyvernid));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Job.Initialize(\"CreateWyvern\", Me)";
_job._initialize /*String*/ (null,ba,"CreateWyvern",parent);
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Job.PostString(\"https://6637fe834253a866a24c8f";
_job._poststring /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns",__ref._createjson /*String*/ (null,_params));
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "wyverns", "createwyvern"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="Log(\"Wyvern created successfully: \" & Job.";
parent.__c.LogImpl("61310733","Wyvern created successfully: "+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="Msgbox(\"Wyvern creado exitosamente\", \"Éxit";
parent.__c.Msgbox(BA.ObjectToCharSequence("Wyvern creado exitosamente"),BA.ObjectToCharSequence("Éxito"),parent.getActivityBA());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
parent.__c.LogImpl("61310736","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="Msgbox(\"Error al crear Wyvern: \" & Job.Err";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error al crear Wyvern: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),parent.getActivityBA());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletewyvern(b4a.example.wyverns __ref,String _id) throws Exception{
RDebugUtils.currentModule="wyverns";
if (Debug.shouldDelegate(ba, "deletewyvern", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "deletewyvern", new Object[] {_id}));}
ResumableSub_DeleteWyvern rsub = new ResumableSub_DeleteWyvern(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteWyvern extends BA.ResumableSub {
public ResumableSub_DeleteWyvern(b4a.example.wyverns parent,b4a.example.wyverns __ref,String _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.wyverns __ref;
b4a.example.wyverns parent;
String _id;
b4a.example.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="wyverns";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Job.Initialize(\"DeleteWyvern\", Me)";
_job._initialize /*String*/ (null,ba,"DeleteWyvern",parent);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Job.Delete(\"https://6637fe834253a866a24c8fc8.mock";
_job._delete /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"+_id);
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "wyverns", "deletewyvern"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Log(\"Wyvern deleted successfully\")";
parent.__c.LogImpl("61507335","Wyvern deleted successfully",0);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Msgbox(\"Wyvern eliminado exitosamente\", \"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Wyvern eliminado exitosamente"),BA.ObjectToCharSequence("Éxito"),parent.getActivityBA());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
parent.__c.LogImpl("61507338","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Msgbox(\"Error al eliminar Wyvern: \" & Job.ErrorM";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error al eliminar Wyvern: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),parent.getActivityBA());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.wyverns __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="wyverns";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="HttpClient.Initialize(\"HttpClient\")";
__ref._httpclient /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper*/ .Initialize("HttpClient");
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readwyvernbyid(b4a.example.wyverns __ref,String _id) throws Exception{
RDebugUtils.currentModule="wyverns";
if (Debug.shouldDelegate(ba, "readwyvernbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readwyvernbyid", new Object[] {_id}));}
ResumableSub_ReadWyvernById rsub = new ResumableSub_ReadWyvernById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadWyvernById extends BA.ResumableSub {
public ResumableSub_ReadWyvernById(b4a.example.wyverns parent,b4a.example.wyverns __ref,String _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.wyverns __ref;
b4a.example.wyverns parent;
String _id;
b4a.example.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _wyvern = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="wyverns";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Job.Initialize(\"ReadWyvernById\", Me)";
_job._initialize /*String*/ (null,ba,"ReadWyvernById",parent);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Job.Download(\"https://6637fe834253a866a24c8fc8";
_job._download /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"+_id);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "wyverns", "readwyvernbyid"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Log(\"Wyvern retrieved successfully: \" & Jo";
parent.__c.LogImpl("61376263","Wyvern retrieved successfully: "+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="Dim wyvern As Map = parser.NextObject";
_wyvern = new anywheresoftware.b4a.objects.collections.Map();
_wyvern = _parser.NextObject();
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="Log(wyvern)";
parent.__c.LogImpl("61376268",BA.ObjectToString(_wyvern),0);
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="Msgbox(\"Wyvern obtenido exitosamente\", \"Éx";
parent.__c.Msgbox(BA.ObjectToCharSequence("Wyvern obtenido exitosamente"),BA.ObjectToCharSequence("Éxito"),parent.getActivityBA());
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="Return wyvern";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_wyvern));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
parent.__c.LogImpl("61376272","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="Msgbox(\"Error al obtener Wyvern: \" & Job.E";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error al obtener Wyvern: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),parent.getActivityBA());
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=1376277;
 //BA.debugLineNum = 1376277;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updatewyvern(b4a.example.wyverns __ref,String _id,String _nombre,String _elemento,String _tipo_wyvernid) throws Exception{
RDebugUtils.currentModule="wyverns";
if (Debug.shouldDelegate(ba, "updatewyvern", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "updatewyvern", new Object[] {_id,_nombre,_elemento,_tipo_wyvernid}));}
ResumableSub_UpdateWyvern rsub = new ResumableSub_UpdateWyvern(this,__ref,_id,_nombre,_elemento,_tipo_wyvernid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateWyvern extends BA.ResumableSub {
public ResumableSub_UpdateWyvern(b4a.example.wyverns parent,b4a.example.wyverns __ref,String _id,String _nombre,String _elemento,String _tipo_wyvernid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._elemento = _elemento;
this._tipo_wyvernid = _tipo_wyvernid;
this.__ref = parent;
}
b4a.example.wyverns __ref;
b4a.example.wyverns parent;
String _id;
String _nombre;
String _elemento;
String _tipo_wyvernid;
anywheresoftware.b4a.objects.collections.Map _params = null;
b4a.example.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="wyverns";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim Params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Params.Put(\"Nombre\", Nombre)";
_params.Put((Object)("Nombre"),(Object)(_nombre));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Params.Put(\"Elemento\", Elemento)";
_params.Put((Object)("Elemento"),(Object)(_elemento));
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Params.Put(\"Tipo_WyvernId\", Tipo_WyvernId)";
_params.Put((Object)("Tipo_WyvernId"),(Object)(_tipo_wyvernid));
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Job.Initialize(\"UpdateWyvern\", Me)";
_job._initialize /*String*/ (null,ba,"UpdateWyvern",parent);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Job.PutString(\"https://6637fe834253a866a24c8fc8.m";
_job._putstring /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"+_id,__ref._createjson /*String*/ (null,_params));
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "wyverns", "updatewyvern"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="Log(\"Wyvern updated successfully: \" & Job.GetStr";
parent.__c.LogImpl("61441805","Wyvern updated successfully: "+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="Msgbox(\"Wyvern actualizado exitosamente\", \"Éxito";
parent.__c.Msgbox(BA.ObjectToCharSequence("Wyvern actualizado exitosamente"),BA.ObjectToCharSequence("Éxito"),parent.getActivityBA());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
parent.__c.LogImpl("61441808","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="Msgbox(\"Error al actualizar Wyvern: \" & Job.Erro";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error al actualizar Wyvern: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),parent.getActivityBA());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}