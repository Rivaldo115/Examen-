package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tipowyvernrepository extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.tipowyvernrepository");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.tipowyvernrepository.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readtipowyvernbyid(b4a.example.tipowyvernrepository __ref,String _id) throws Exception{
RDebugUtils.currentModule="tipowyvernrepository";
if (Debug.shouldDelegate(ba, "readtipowyvernbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readtipowyvernbyid", new Object[] {_id}));}
ResumableSub_ReadTipoWyvernById rsub = new ResumableSub_ReadTipoWyvernById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadTipoWyvernById extends BA.ResumableSub {
public ResumableSub_ReadTipoWyvernById(b4a.example.tipowyvernrepository parent,b4a.example.tipowyvernrepository __ref,String _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.tipowyvernrepository __ref;
b4a.example.tipowyvernrepository parent;
String _id;
b4a.example.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _tipowyvern = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tipowyvernrepository";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Job.Initialize(\"ReadTipoWyvernById\", Me)";
_job._initialize /*String*/ (null,ba,"ReadTipoWyvernById",parent);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Job.Download(\"https://6637fe834253a866a24c8fc8.mo";
_job._download /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"+_id);
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tipowyvernrepository", "readtipowyvernbyid"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Log(\"Tipo Wyvern retrieved successfully: \" & Job";
parent.__c.LogImpl("62097159","Tipo Wyvern retrieved successfully: "+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Dim tipoWyvern As Map = parser.NextObject";
_tipowyvern = new anywheresoftware.b4a.objects.collections.Map();
_tipowyvern = _parser.NextObject();
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="Log(tipoWyvern)";
parent.__c.LogImpl("62097164",BA.ObjectToString(_tipowyvern),0);
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="CallSub2(Main, \"FillTipoWyvernDetails\", tipoWyve";
parent.__c.CallSubDebug2(ba,(Object)(parent._main.getObject()),"FillTipoWyvernDetails",(Object)(_tipowyvern));
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="Msgbox(\"Tipo Wyvern obtenido exitosamente\", \"Éxi";
parent.__c.Msgbox(BA.ObjectToCharSequence("Tipo Wyvern obtenido exitosamente"),BA.ObjectToCharSequence("Éxito"),parent.getActivityBA());
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="Return tipoWyvern";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_tipowyvern));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
parent.__c.LogImpl("62097172","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="Msgbox(\"Error al obtener Tipo Wyvern: \" & Job.Er";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error al obtener Tipo Wyvern: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),parent.getActivityBA());
RDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2097176;
 //BA.debugLineNum = 2097176;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=2097177;
 //BA.debugLineNum = 2097177;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _deletetipowyvern(b4a.example.tipowyvernrepository __ref,String _id) throws Exception{
RDebugUtils.currentModule="tipowyvernrepository";
if (Debug.shouldDelegate(ba, "deletetipowyvern", false))
	 {Debug.delegate(ba, "deletetipowyvern", new Object[] {_id}); return;}
ResumableSub_DeleteTipoWyvern rsub = new ResumableSub_DeleteTipoWyvern(this,__ref,_id);
rsub.resume(ba, null);
}
public static class ResumableSub_DeleteTipoWyvern extends BA.ResumableSub {
public ResumableSub_DeleteTipoWyvern(b4a.example.tipowyvernrepository parent,b4a.example.tipowyvernrepository __ref,String _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.tipowyvernrepository __ref;
b4a.example.tipowyvernrepository parent;
String _id;
b4a.example.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tipowyvernrepository";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Job.Initialize(\"DeleteTipoWyvern\", Me)";
_job._initialize /*String*/ (null,ba,"DeleteTipoWyvern",parent);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Job.Delete(\"https://6637fe834253a866a24c8fc8.mock";
_job._delete /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"+_id);
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tipowyvernrepository", "deletetipowyvern"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Log(\"Tipo Wyvern deleted successfully\")";
parent.__c.LogImpl("62228231","Tipo Wyvern deleted successfully",0);
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="Msgbox(\"Tipo Wyvern eliminado exitosamente\", \"Éx";
parent.__c.Msgbox(BA.ObjectToCharSequence("Tipo Wyvern eliminado exitosamente"),BA.ObjectToCharSequence("Éxito"),parent.getActivityBA());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
parent.__c.LogImpl("62228234","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="Msgbox(\"Error al eliminar Tipo Wyvern: \" & Job.E";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error al eliminar Tipo Wyvern: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),parent.getActivityBA());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.tipowyvernrepository __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tipowyvernrepository";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Private HttpClient As OkHttpClient";
_httpclient = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public String  _createjson(b4a.example.tipowyvernrepository __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="tipowyvernrepository";
if (Debug.shouldDelegate(ba, "createjson", false))
	 {return ((String) Debug.delegate(ba, "createjson", new Object[] {_params}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub CreateJson(Params As Map) As String";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="json.Initialize(Params)";
_json.Initialize(_params);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Return json.ToString";
if (true) return _json.ToString();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createtipowyvern(b4a.example.tipowyvernrepository __ref,String _nombre) throws Exception{
RDebugUtils.currentModule="tipowyvernrepository";
if (Debug.shouldDelegate(ba, "createtipowyvern", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "createtipowyvern", new Object[] {_nombre}));}
ResumableSub_CreateTipoWyvern rsub = new ResumableSub_CreateTipoWyvern(this,__ref,_nombre);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateTipoWyvern extends BA.ResumableSub {
public ResumableSub_CreateTipoWyvern(b4a.example.tipowyvernrepository parent,b4a.example.tipowyvernrepository __ref,String _nombre) {
this.parent = parent;
this.__ref = __ref;
this._nombre = _nombre;
this.__ref = parent;
}
b4a.example.tipowyvernrepository __ref;
b4a.example.tipowyvernrepository parent;
String _nombre;
anywheresoftware.b4a.objects.collections.Map _params = null;
b4a.example.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tipowyvernrepository";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim Params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Params.Put(\"Nombre\", Nombre)";
_params.Put((Object)("Nombre"),(Object)(_nombre));
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Job.Initialize(\"CreateTipoWyvern\", Me)";
_job._initialize /*String*/ (null,ba,"CreateTipoWyvern",parent);
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Job.PostString(\"https://6637fe834253a866a24c8fc8.";
_job._poststring /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern",__ref._createjson /*String*/ (null,_params));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tipowyvernrepository", "createtipowyvern"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Log(\"Tipo Wyvern created successfully: \" & Job.G";
parent.__c.LogImpl("62031627","Tipo Wyvern created successfully: "+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="Msgbox(\"Tipo Wyvern creado exitosamente\", \"Éxito";
parent.__c.Msgbox(BA.ObjectToCharSequence("Tipo Wyvern creado exitosamente"),BA.ObjectToCharSequence("Éxito"),parent.getActivityBA());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
parent.__c.LogImpl("62031630","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="Msgbox(\"Error al crear Tipo Wyvern: \" & Job.Erro";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error al crear Tipo Wyvern: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),parent.getActivityBA());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.tipowyvernrepository __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tipowyvernrepository";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="HttpClient.Initialize(\"HttpClient\")";
__ref._httpclient /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper*/ .Initialize("HttpClient");
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updatetipowyvern(b4a.example.tipowyvernrepository __ref,String _id,String _nombre) throws Exception{
RDebugUtils.currentModule="tipowyvernrepository";
if (Debug.shouldDelegate(ba, "updatetipowyvern", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "updatetipowyvern", new Object[] {_id,_nombre}));}
ResumableSub_UpdateTipoWyvern rsub = new ResumableSub_UpdateTipoWyvern(this,__ref,_id,_nombre);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateTipoWyvern extends BA.ResumableSub {
public ResumableSub_UpdateTipoWyvern(b4a.example.tipowyvernrepository parent,b4a.example.tipowyvernrepository __ref,String _id,String _nombre) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this.__ref = parent;
}
b4a.example.tipowyvernrepository __ref;
b4a.example.tipowyvernrepository parent;
String _id;
String _nombre;
anywheresoftware.b4a.objects.collections.Map _params = null;
b4a.example.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tipowyvernrepository";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim Params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Params.Put(\"Nombre\", Nombre)";
_params.Put((Object)("Nombre"),(Object)(_nombre));
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Job.Initialize(\"UpdateTipoWyvern\", Me)";
_job._initialize /*String*/ (null,ba,"UpdateTipoWyvern",parent);
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Job.PutString(\"https://6637fe834253a866a24c8fc8.m";
_job._putstring /*String*/ (null,"https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"+_id,__ref._createjson /*String*/ (null,_params));
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tipowyvernrepository", "updatetipowyvern"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Log(\"Tipo Wyvern updated successfully: \" & Job.G";
parent.__c.LogImpl("62162699","Tipo Wyvern updated successfully: "+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Msgbox(\"Tipo Wyvern actualizado exitosamente\", \"";
parent.__c.Msgbox(BA.ObjectToCharSequence("Tipo Wyvern actualizado exitosamente"),BA.ObjectToCharSequence("Éxito"),parent.getActivityBA());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
parent.__c.LogImpl("62162702","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="Msgbox(\"Error al actualizar Tipo Wyvern: \" & Job";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error al actualizar Tipo Wyvern: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),parent.getActivityBA());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}