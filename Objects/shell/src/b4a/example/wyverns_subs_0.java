package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class wyverns_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private HttpClient As OkHttpClient";
wyverns._httpclient = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");__ref.setField("_httpclient",wyverns._httpclient);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createjson(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("CreateJson (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("createjson")) { return __ref.runUserSub(false, "wyverns","createjson", __ref, _params);}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("Params", _params);
 BA.debugLineNum = 93;BA.debugLine="Private Sub CreateJson(Params As Map) As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(536870912);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 95;BA.debugLine="json.Initialize(Params)";
Debug.ShouldStop(1073741824);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 96;BA.debugLine="Return json.ToString";
Debug.ShouldStop(-2147483648);
if (true) return _json.runMethod(true,"ToString");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createwyvern(RemoteObject __ref,RemoteObject _nombre,RemoteObject _elemento,RemoteObject _tipo_wyvernid) throws Exception{
try {
		Debug.PushSubsStack("CreateWyvern (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("createwyvern")) { return __ref.runUserSub(false, "wyverns","createwyvern", __ref, _nombre, _elemento, _tipo_wyvernid);}
ResumableSub_CreateWyvern rsub = new ResumableSub_CreateWyvern(null,__ref,_nombre,_elemento,_tipo_wyvernid);
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
public static class ResumableSub_CreateWyvern extends BA.ResumableSub {
public ResumableSub_CreateWyvern(b4a.example.wyverns parent,RemoteObject __ref,RemoteObject _nombre,RemoteObject _elemento,RemoteObject _tipo_wyvernid) {
this.parent = parent;
this.__ref = __ref;
this._nombre = _nombre;
this._elemento = _elemento;
this._tipo_wyvernid = _tipo_wyvernid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.wyverns parent;
RemoteObject _nombre;
RemoteObject _elemento;
RemoteObject _tipo_wyvernid;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateWyvern (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,9);
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
Debug.locals.put("Elemento", _elemento);
Debug.locals.put("Tipo_WyvernId", _tipo_wyvernid);
 BA.debugLineNum = 10;BA.debugLine="Dim Params As Map";
Debug.ShouldStop(512);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Params", _params);
 BA.debugLineNum = 11;BA.debugLine="Params.Initialize";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 12;BA.debugLine="Params.Put(\"Nombre\", Nombre)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((_nombre)));
 BA.debugLineNum = 13;BA.debugLine="Params.Put(\"Elemento\", Elemento)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Elemento"))),(Object)((_elemento)));
 BA.debugLineNum = 14;BA.debugLine="Params.Put(\"Tipo_WyvernId\", Tipo_WyvernId)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_WyvernId"))),(Object)((_tipo_wyvernid)));
 BA.debugLineNum = 16;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(32768);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 17;BA.debugLine="Job.Initialize(\"CreateWyvern\", Me)";
Debug.ShouldStop(65536);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CreateWyvern")),(Object)(__ref));
 BA.debugLineNum = 18;BA.debugLine="Job.PostString(\"https://6637fe834253a866a24c8f";
Debug.ShouldStop(131072);
_job.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns")),(Object)(__ref.runClassMethod (b4a.example.wyverns.class, "_createjson" /*RemoteObject*/ ,(Object)(_params))));
 BA.debugLineNum = 20;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "wyverns", "createwyvern"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 21;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 22;BA.debugLine="Log(\"Wyvern created successfully: \" & Job.";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","61310733",RemoteObject.concat(RemoteObject.createImmutable("Wyvern created successfully: "),_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 23;BA.debugLine="Msgbox(\"Wyvern creado exitosamente\", \"Éxit";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wyvern creado exitosamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 25;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","61310736",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 26;BA.debugLine="Msgbox(\"Error al crear Wyvern: \" & Job.Err";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al crear Wyvern: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 28;BA.debugLine="Job.Release";
Debug.ShouldStop(134217728);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _deletewyvern(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("DeleteWyvern (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("deletewyvern")) { return __ref.runUserSub(false, "wyverns","deletewyvern", __ref, _id);}
ResumableSub_DeleteWyvern rsub = new ResumableSub_DeleteWyvern(null,__ref,_id);
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
public static class ResumableSub_DeleteWyvern extends BA.ResumableSub {
public ResumableSub_DeleteWyvern(b4a.example.wyverns parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.wyverns parent;
RemoteObject _id;
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteWyvern (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,77);
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
 BA.debugLineNum = 78;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8192);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 79;BA.debugLine="Job.Initialize(\"DeleteWyvern\", Me)";
Debug.ShouldStop(16384);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DeleteWyvern")),(Object)(__ref));
 BA.debugLineNum = 80;BA.debugLine="Job.Delete(\"https://6637fe834253a866a24c8fc8.mock";
Debug.ShouldStop(32768);
_job.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"),_id)));
 BA.debugLineNum = 82;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "wyverns", "deletewyvern"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 83;BA.debugLine="If Job.Success Then";
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
 BA.debugLineNum = 84;BA.debugLine="Log(\"Wyvern deleted successfully\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","61507335",RemoteObject.createImmutable("Wyvern deleted successfully"),0);
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Wyvern eliminado exitosamente\", \"Éxito\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wyvern eliminado exitosamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 87;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","61507338",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 88;BA.debugLine="Msgbox(\"Error al eliminar Wyvern: \" & Job.ErrorM";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al eliminar Wyvern: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 90;BA.debugLine="Job.Release";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 91;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,5);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "wyverns","initialize", __ref, _ba);}
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
public static RemoteObject  _readwyvernbyid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ReadWyvernById (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("readwyvernbyid")) { return __ref.runUserSub(false, "wyverns","readwyvernbyid", __ref, _id);}
ResumableSub_ReadWyvernById rsub = new ResumableSub_ReadWyvernById(null,__ref,_id);
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
public static class ResumableSub_ReadWyvernById extends BA.ResumableSub {
public ResumableSub_ReadWyvernById(b4a.example.wyverns parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.wyverns parent;
RemoteObject _id;
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _wyvern = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadWyvernById (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,32);
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
 BA.debugLineNum = 33;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 34;BA.debugLine="Job.Initialize(\"ReadWyvernById\", Me)";
Debug.ShouldStop(2);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ReadWyvernById")),(Object)(__ref));
 BA.debugLineNum = 35;BA.debugLine="Job.Download(\"https://6637fe834253a866a24c8fc8";
Debug.ShouldStop(4);
_job.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"),_id)));
 BA.debugLineNum = 37;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "wyverns", "readwyvernbyid"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 38;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 39;BA.debugLine="Log(\"Wyvern retrieved successfully: \" & Jo";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","61376263",RemoteObject.concat(RemoteObject.createImmutable("Wyvern retrieved successfully: "),_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 41;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 42;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="Dim wyvern As Map = parser.NextObject";
Debug.ShouldStop(1024);
_wyvern = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_wyvern = _parser.runMethod(false,"NextObject");Debug.locals.put("wyvern", _wyvern);Debug.locals.put("wyvern", _wyvern);
 BA.debugLineNum = 44;BA.debugLine="Log(wyvern)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","61376268",BA.ObjectToString(_wyvern),0);
 BA.debugLineNum = 45;BA.debugLine="Msgbox(\"Wyvern obtenido exitosamente\", \"Éx";
Debug.ShouldStop(4096);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wyvern obtenido exitosamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.runMethod(false,"getActivityBA"));
 BA.debugLineNum = 46;BA.debugLine="Return wyvern";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_wyvern));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 48;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","61376272",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 49;BA.debugLine="Msgbox(\"Error al obtener Wyvern: \" & Job.E";
Debug.ShouldStop(65536);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al obtener Wyvern: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.runMethod(false,"getActivityBA"));
 BA.debugLineNum = 50;BA.debugLine="Return Null";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 52;BA.debugLine="Job.Release";
Debug.ShouldStop(524288);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _updatewyvern(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _elemento,RemoteObject _tipo_wyvernid) throws Exception{
try {
		Debug.PushSubsStack("UpdateWyvern (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("updatewyvern")) { return __ref.runUserSub(false, "wyverns","updatewyvern", __ref, _id, _nombre, _elemento, _tipo_wyvernid);}
ResumableSub_UpdateWyvern rsub = new ResumableSub_UpdateWyvern(null,__ref,_id,_nombre,_elemento,_tipo_wyvernid);
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
public static class ResumableSub_UpdateWyvern extends BA.ResumableSub {
public ResumableSub_UpdateWyvern(b4a.example.wyverns parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _elemento,RemoteObject _tipo_wyvernid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._elemento = _elemento;
this._tipo_wyvernid = _tipo_wyvernid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.wyverns parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _elemento;
RemoteObject _tipo_wyvernid;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateWyvern (wyverns) ","wyverns",3,__ref.getField(false, "ba"),__ref,55);
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
Debug.locals.put("Elemento", _elemento);
Debug.locals.put("Tipo_WyvernId", _tipo_wyvernid);
 BA.debugLineNum = 56;BA.debugLine="Dim Params As Map";
Debug.ShouldStop(8388608);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Params", _params);
 BA.debugLineNum = 57;BA.debugLine="Params.Initialize";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="Params.Put(\"Nombre\", Nombre)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((_nombre)));
 BA.debugLineNum = 59;BA.debugLine="Params.Put(\"Elemento\", Elemento)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Elemento"))),(Object)((_elemento)));
 BA.debugLineNum = 60;BA.debugLine="Params.Put(\"Tipo_WyvernId\", Tipo_WyvernId)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_WyvernId"))),(Object)((_tipo_wyvernid)));
 BA.debugLineNum = 62;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(536870912);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 63;BA.debugLine="Job.Initialize(\"UpdateWyvern\", Me)";
Debug.ShouldStop(1073741824);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("UpdateWyvern")),(Object)(__ref));
 BA.debugLineNum = 64;BA.debugLine="Job.PutString(\"https://6637fe834253a866a24c8fc8.m";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"),_id)),(Object)(__ref.runClassMethod (b4a.example.wyverns.class, "_createjson" /*RemoteObject*/ ,(Object)(_params))));
 BA.debugLineNum = 66;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "wyverns", "updatewyvern"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 67;BA.debugLine="If Job.Success Then";
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
 BA.debugLineNum = 68;BA.debugLine="Log(\"Wyvern updated successfully: \" & Job.GetStr";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","61441805",RemoteObject.concat(RemoteObject.createImmutable("Wyvern updated successfully: "),_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Wyvern actualizado exitosamente\", \"Éxito";
Debug.ShouldStop(16);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wyvern actualizado exitosamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 71;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","61441808",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 72;BA.debugLine="Msgbox(\"Error al actualizar Wyvern: \" & Job.Erro";
Debug.ShouldStop(128);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al actualizar Wyvern: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.runMethod(false,"getActivityBA"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 74;BA.debugLine="Job.Release";
Debug.ShouldStop(512);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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