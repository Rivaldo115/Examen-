package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tipowyvernrepository_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private HttpClient As OkHttpClient";
tipowyvernrepository._httpclient = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");__ref.setField("_httpclient",tipowyvernrepository._httpclient);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createjson(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("CreateJson (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("createjson")) { return __ref.runUserSub(false, "tipowyvernrepository","createjson", __ref, _params);}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 92;BA.debugLine="Private Sub CreateJson(Params As Map) As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(268435456);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 94;BA.debugLine="json.Initialize(Params)";
Debug.ShouldStop(536870912);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 95;BA.debugLine="Return json.ToString";
Debug.ShouldStop(1073741824);
if (true) return _json.runMethod(true,"ToString");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtipowyvern(RemoteObject __ref,RemoteObject _nombre) throws Exception{
try {
		Debug.PushSubsStack("CreateTipoWyvern (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("createtipowyvern")) { return __ref.runUserSub(false, "tipowyvernrepository","createtipowyvern", __ref, _nombre);}
ResumableSub_CreateTipoWyvern rsub = new ResumableSub_CreateTipoWyvern(null,__ref,_nombre);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateTipoWyvern extends BA.ResumableSub {
public ResumableSub_CreateTipoWyvern(b4a.example.tipowyvernrepository parent,RemoteObject __ref,RemoteObject _nombre) {
this.parent = parent;
this.__ref = __ref;
this._nombre = _nombre;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.tipowyvernrepository parent;
RemoteObject _nombre;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateTipoWyvern (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,9);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Nombre", _nombre);
 BA.debugLineNum = 10;BA.debugLine="Dim Params As Map";
Debug.ShouldStop(512);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Params", _params);
 BA.debugLineNum = 11;BA.debugLine="Params.Initialize";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 12;BA.debugLine="Params.Put(\"Nombre\", Nombre)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((_nombre)));
 BA.debugLineNum = 14;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8192);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 15;BA.debugLine="Job.Initialize(\"CreateTipoWyvern\", Me)";
Debug.ShouldStop(16384);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CreateTipoWyvern")),(Object)(__ref));
 BA.debugLineNum = 16;BA.debugLine="Job.PostString(\"https://6637fe834253a866a24c8fc8.";
Debug.ShouldStop(32768);
_job.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern")),(Object)(__ref.runClassMethod (b4a.example.tipowyvernrepository.class, "_createjson" /*RemoteObject*/ ,(Object)(_params))));
 BA.debugLineNum = 18;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "tipowyvernrepository", "createtipowyvern"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 19;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 20;BA.debugLine="Log(\"Tipo Wyvern created successfully: \" & Job.G";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","62031627",RemoteObject.concat(RemoteObject.createImmutable("Tipo Wyvern created successfully: "),_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 21;BA.debugLine="Msgbox(\"Tipo Wyvern creado exitosamente\", \"Éxito";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Tipo Wyvern creado exitosamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 23;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","62031630",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 24;BA.debugLine="Msgbox(\"Error al crear Tipo Wyvern: \" & Job.Erro";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al crear Tipo Wyvern: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 26;BA.debugLine="Job.Release";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
}
public static void  _deletetipowyvern(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("DeleteTipoWyvern (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("deletetipowyvern")) { __ref.runUserSub(false, "tipowyvernrepository","deletetipowyvern", __ref, _id); return;}
ResumableSub_DeleteTipoWyvern rsub = new ResumableSub_DeleteTipoWyvern(null,__ref,_id);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DeleteTipoWyvern extends BA.ResumableSub {
public ResumableSub_DeleteTipoWyvern(b4a.example.tipowyvernrepository parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.tipowyvernrepository parent;
RemoteObject _id;
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteTipoWyvern (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,76);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Id", _id);
 BA.debugLineNum = 77;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4096);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 78;BA.debugLine="Job.Initialize(\"DeleteTipoWyvern\", Me)";
Debug.ShouldStop(8192);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DeleteTipoWyvern")),(Object)(__ref));
 BA.debugLineNum = 79;BA.debugLine="Job.Delete(\"https://6637fe834253a866a24c8fc8.mock";
Debug.ShouldStop(16384);
_job.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"),_id)));
 BA.debugLineNum = 81;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "tipowyvernrepository", "deletetipowyvern"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 82;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 6;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 83;BA.debugLine="Log(\"Tipo Wyvern deleted successfully\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","62228231",RemoteObject.createImmutable("Tipo Wyvern deleted successfully"),0);
 BA.debugLineNum = 84;BA.debugLine="Msgbox(\"Tipo Wyvern eliminado exitosamente\", \"Éx";
Debug.ShouldStop(524288);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Tipo Wyvern eliminado exitosamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 86;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","62228234",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 87;BA.debugLine="Msgbox(\"Error al eliminar Tipo Wyvern: \" & Job.E";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al eliminar Tipo Wyvern: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 89;BA.debugLine="Job.Release";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,5);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "tipowyvernrepository","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16);
 BA.debugLineNum = 6;BA.debugLine="HttpClient.Initialize(\"HttpClient\")";
Debug.ShouldStop(32);
__ref.getField(false,"_httpclient" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("HttpClient")));
 BA.debugLineNum = 7;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readtipowyvernbyid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ReadTipoWyvernById (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("readtipowyvernbyid")) { return __ref.runUserSub(false, "tipowyvernrepository","readtipowyvernbyid", __ref, _id);}
ResumableSub_ReadTipoWyvernById rsub = new ResumableSub_ReadTipoWyvernById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReadTipoWyvernById extends BA.ResumableSub {
public ResumableSub_ReadTipoWyvernById(b4a.example.tipowyvernrepository parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.tipowyvernrepository parent;
RemoteObject _id;
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _tipowyvern = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadTipoWyvernById (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,29);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Id", _id);
 BA.debugLineNum = 30;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(536870912);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 31;BA.debugLine="Job.Initialize(\"ReadTipoWyvernById\", Me)";
Debug.ShouldStop(1073741824);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ReadTipoWyvernById")),(Object)(__ref));
 BA.debugLineNum = 32;BA.debugLine="Job.Download(\"https://6637fe834253a866a24c8fc8.mo";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"),_id)));
 BA.debugLineNum = 34;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "tipowyvernrepository", "readtipowyvernbyid"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 35;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 6;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 36;BA.debugLine="Log(\"Tipo Wyvern retrieved successfully: \" & Job";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","62097159",RemoteObject.concat(RemoteObject.createImmutable("Tipo Wyvern retrieved successfully: "),_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 38;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 39;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="Dim tipoWyvern As Map = parser.NextObject";
Debug.ShouldStop(128);
_tipowyvern = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tipowyvern = _parser.runMethod(false,"NextObject");Debug.locals.put("tipoWyvern", _tipowyvern);Debug.locals.put("tipoWyvern", _tipowyvern);
 BA.debugLineNum = 41;BA.debugLine="Log(tipoWyvern)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","62097164",BA.ObjectToString(_tipowyvern),0);
 BA.debugLineNum = 44;BA.debugLine="CallSub2(Main, \"FillTipoWyvernDetails\", tipoWyve";
Debug.ShouldStop(2048);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((parent._main.getObject())),(Object)(BA.ObjectToString("FillTipoWyvernDetails")),(Object)((_tipowyvern)));
 BA.debugLineNum = 46;BA.debugLine="Msgbox(\"Tipo Wyvern obtenido exitosamente\", \"Éxi";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Tipo Wyvern obtenido exitosamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.runMethod(false,"getActivityBA"));
 BA.debugLineNum = 47;BA.debugLine="Return tipoWyvern";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_tipowyvern));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 49;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","62097172",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 50;BA.debugLine="Msgbox(\"Error al obtener Tipo Wyvern: \" & Job.Er";
Debug.ShouldStop(131072);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al obtener Tipo Wyvern: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.runMethod(false,"getActivityBA"));
 BA.debugLineNum = 51;BA.debugLine="Return Null";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 53;BA.debugLine="Job.Release";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _updatetipowyvern(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre) throws Exception{
try {
		Debug.PushSubsStack("UpdateTipoWyvern (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("updatetipowyvern")) { return __ref.runUserSub(false, "tipowyvernrepository","updatetipowyvern", __ref, _id, _nombre);}
ResumableSub_UpdateTipoWyvern rsub = new ResumableSub_UpdateTipoWyvern(null,__ref,_id,_nombre);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateTipoWyvern extends BA.ResumableSub {
public ResumableSub_UpdateTipoWyvern(b4a.example.tipowyvernrepository parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.tipowyvernrepository parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateTipoWyvern (tipowyvernrepository) ","tipowyvernrepository",6,__ref.getField(false, "ba"),__ref,56);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Id", _id);
Debug.locals.put("Nombre", _nombre);
 BA.debugLineNum = 57;BA.debugLine="Dim Params As Map";
Debug.ShouldStop(16777216);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Params", _params);
 BA.debugLineNum = 58;BA.debugLine="Params.Initialize";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="Params.Put(\"Nombre\", Nombre)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((_nombre)));
 BA.debugLineNum = 61;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(268435456);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 62;BA.debugLine="Job.Initialize(\"UpdateTipoWyvern\", Me)";
Debug.ShouldStop(536870912);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("UpdateTipoWyvern")),(Object)(__ref));
 BA.debugLineNum = 63;BA.debugLine="Job.PutString(\"https://6637fe834253a866a24c8fc8.m";
Debug.ShouldStop(1073741824);
_job.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"),_id)),(Object)(__ref.runClassMethod (b4a.example.tipowyvernrepository.class, "_createjson" /*RemoteObject*/ ,(Object)(_params))));
 BA.debugLineNum = 65;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "tipowyvernrepository", "updatetipowyvern"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 66;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 6;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 67;BA.debugLine="Log(\"Tipo Wyvern updated successfully: \" & Job.G";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","62162699",RemoteObject.concat(RemoteObject.createImmutable("Tipo Wyvern updated successfully: "),_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 68;BA.debugLine="Msgbox(\"Tipo Wyvern actualizado exitosamente\", \"";
Debug.ShouldStop(8);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Tipo Wyvern actualizado exitosamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 70;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","62162702",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 71;BA.debugLine="Msgbox(\"Error al actualizar Tipo Wyvern: \" & Job";
Debug.ShouldStop(64);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al actualizar Tipo Wyvern: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 73;BA.debugLine="Job.Release";
Debug.ShouldStop(256);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}