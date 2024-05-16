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
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(268435456);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="CargarTiposDeWyvern";
Debug.ShouldStop(536870912);
_cargartiposdewyvern();
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,33);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnbuscar_click() throws Exception{
try {
		Debug.PushSubsStack("btnBuscar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,124);
if (RapidSub.canDelegate("btnbuscar_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","btnbuscar_click"); return;}
ResumableSub_btnBuscar_Click rsub = new ResumableSub_btnBuscar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBuscar_Click extends BA.ResumableSub {
public ResumableSub_btnBuscar_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tipowyvernid = RemoteObject.createImmutable("");
RemoteObject _tipowyvernnombre = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBuscar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,124);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 125;BA.debugLine="Dim Id As Int";
Debug.ShouldStop(268435456);
_id = RemoteObject.createImmutable(0);Debug.locals.put("Id", _id);
 BA.debugLineNum = 126;BA.debugLine="Try";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 127;BA.debugLine="Id = txtId.Text";
Debug.ShouldStop(1073741824);
_id = BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText"));Debug.locals.put("Id", _id);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 129;BA.debugLine="MsgboxAsync(\"El Id debe ser numérico.\", \"Error\")";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("El Id debe ser numérico.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 BA.debugLineNum = 130;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
 BA.debugLineNum = 133;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(16);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 134;BA.debugLine="peticion.Initialize(\"\", Me)";
Debug.ShouldStop(32);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 135;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
Debug.ShouldStop(64);
_peticion.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"),_id)));
 BA.debugLineNum = 136;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnbuscar_click"), (_peticion));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 138;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(512);
if (true) break;

case 7:
//if
this.state = 12;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 139;BA.debugLine="Dim json As String";
Debug.ShouldStop(1024);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 140;BA.debugLine="json = respuesta.GetString";
Debug.ShouldStop(2048);
_json = _respuesta.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 142;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(8192);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 143;BA.debugLine="jsonParser.Initialize(json)";
Debug.ShouldStop(16384);
_jsonparser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 145;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(65536);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 149;BA.debugLine="txtId.Text = map.Get(\"id\")";
Debug.ShouldStop(1048576);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 150;BA.debugLine="txtNombre.Text = map.Get(\"Nombre\")";
Debug.ShouldStop(2097152);
parent.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 BA.debugLineNum = 151;BA.debugLine="txtElemento.Text = map.Get(\"Elemento\")";
Debug.ShouldStop(4194304);
parent.mostCurrent._txtelemento.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Elemento"))))));
 BA.debugLineNum = 152;BA.debugLine="txtTipo.Text = map.Get(\"Tipo_WyvernId\")";
Debug.ShouldStop(8388608);
parent.mostCurrent._txttipo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tipo_WyvernId"))))));
 BA.debugLineNum = 154;BA.debugLine="Dim tipoWyvernId As String = map.Get(\"Tipo_Wyver";
Debug.ShouldStop(33554432);
_tipowyvernid = BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tipo_WyvernId")))));Debug.locals.put("tipoWyvernId", _tipowyvernid);Debug.locals.put("tipoWyvernId", _tipowyvernid);
 BA.debugLineNum = 155;BA.debugLine="Dim tipoWyvernNombre As String = tiposWyverns.Ge";
Debug.ShouldStop(67108864);
_tipowyvernnombre = BA.ObjectToString(parent.mostCurrent._tiposwyverns.runMethod(false,"Get",(Object)((_tipowyvernid))));Debug.locals.put("tipoWyvernNombre", _tipowyvernnombre);Debug.locals.put("tipoWyvernNombre", _tipowyvernnombre);
 BA.debugLineNum = 156;BA.debugLine="actTipo.Text = tipoWyvernNombre";
Debug.ShouldStop(134217728);
parent.mostCurrent._acttipo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_tipowyvernnombre));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 159;BA.debugLine="MsgboxAsync(\"No se pudo obtener la información d";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo obtener la información del wyvern. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 162;BA.debugLine="peticion.Release";
Debug.ShouldStop(2);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static void  _jobdone(RemoteObject _respuesta) throws Exception{
}
public static void  _btneditar_click() throws Exception{
try {
		Debug.PushSubsStack("btnEditar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,211);
if (RapidSub.canDelegate("btneditar_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","btneditar_click"); return;}
ResumableSub_btnEditar_Click rsub = new ResumableSub_btnEditar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEditar_Click extends BA.ResumableSub {
public ResumableSub_btnEditar_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _tipo = RemoteObject.createImmutable("");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEditar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,211);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 213;BA.debugLine="If txtId.Text.Trim = \"\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._txtid.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 214;BA.debugLine="MsgboxAsync(\"El ID es necesario para actualizar.";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("El ID es necesario para actualizar.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 BA.debugLineNum = 215;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 219;BA.debugLine="Dim tipo As String = GetKeyFromValue(tiposWyverns";
Debug.ShouldStop(67108864);
_tipo = _getkeyfromvalue(parent.mostCurrent._tiposwyverns,parent.mostCurrent._acttipo.runMethod(true,"getText"));Debug.locals.put("tipo", _tipo);Debug.locals.put("tipo", _tipo);
 BA.debugLineNum = 220;BA.debugLine="If tipo = \"\" Then";
Debug.ShouldStop(134217728);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString(""))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 221;BA.debugLine="MsgboxAsync(\"Tipo de Wyvern no válido.\", \"Error\"";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Tipo de Wyvern no válido.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 BA.debugLineNum = 222;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 226;BA.debugLine="Dim map As Map";
Debug.ShouldStop(2);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 227;BA.debugLine="Dim json As String";
Debug.ShouldStop(4);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 228;BA.debugLine="Dim jsonGenerator As JSONGenerator";
Debug.ShouldStop(8);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGenerator", _jsongenerator);
 BA.debugLineNum = 229;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(16);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 230;BA.debugLine="peticion.Initialize(\"jobUpdate\", Me)";
Debug.ShouldStop(32);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("jobUpdate")),(Object)(main.getObject()));
 BA.debugLineNum = 232;BA.debugLine="map.Initialize";
Debug.ShouldStop(128);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 233;BA.debugLine="map.Put(\"id\", txtId.Text)";
Debug.ShouldStop(256);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((parent.mostCurrent._txtid.runMethod(true,"getText"))));
 BA.debugLineNum = 234;BA.debugLine="map.Put(\"Nombre\", txtNombre.Text)";
Debug.ShouldStop(512);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((parent.mostCurrent._txtnombre.runMethod(true,"getText"))));
 BA.debugLineNum = 235;BA.debugLine="map.Put(\"Elemento\", txtElemento.Text)";
Debug.ShouldStop(1024);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Elemento"))),(Object)((parent.mostCurrent._txtelemento.runMethod(true,"getText"))));
 BA.debugLineNum = 236;BA.debugLine="map.Put(\"Tipo_WyvernId\", tipo)";
Debug.ShouldStop(2048);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_WyvernId"))),(Object)((_tipo)));
 BA.debugLineNum = 239;BA.debugLine="jsonGenerator.Initialize(map)";
Debug.ShouldStop(16384);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_map));
 BA.debugLineNum = 240;BA.debugLine="json = jsonGenerator.ToString";
Debug.ShouldStop(32768);
_json = _jsongenerator.runMethod(true,"ToString");Debug.locals.put("json", _json);
 BA.debugLineNum = 243;BA.debugLine="peticion.PutString(\"https://6637fe834253a866a24c8";
Debug.ShouldStop(262144);
_peticion.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/"),parent.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(_json));
 BA.debugLineNum = 244;BA.debugLine="peticion.GetRequest.SetContentType(\"application/j";
Debug.ShouldStop(524288);
_peticion.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 247;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btneditar_click"), (_peticion));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 248;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 9:
//if
this.state = 14;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 249;BA.debugLine="MsgboxAsync(\"Actualizado!\", \"Éxito\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Actualizado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),main.processBA);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 251;BA.debugLine="MsgboxAsync(\"No se pudo actualizar. \" & respuest";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo actualizar. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 253;BA.debugLine="peticion.Release";
Debug.ShouldStop(268435456);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static void  _btneliminar_click() throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,79);
if (RapidSub.canDelegate("btneliminar_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","btneliminar_click"); return;}
ResumableSub_btnEliminar_Click rsub = new ResumableSub_btnEliminar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEliminar_Click extends BA.ResumableSub {
public ResumableSub_btnEliminar_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _wyvernid = RemoteObject.createImmutable(0);
RemoteObject _tipoid = RemoteObject.createImmutable(0);
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,79);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 81;BA.debugLine="If txtId.Text.Trim = \"\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._txtid.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 82;BA.debugLine="MsgboxAsync(\"Debes ingresar el ID del wyvern par";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Debes ingresar el ID del wyvern para eliminarlo.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 BA.debugLineNum = 83;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 86;BA.debugLine="If txtTipo.Text.Trim = \"\" Then";
Debug.ShouldStop(2097152);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._txttipo.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 87;BA.debugLine="MsgboxAsync(\"Debes ingresar el ID del tipo de wy";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Debes ingresar el ID del tipo de wyvern para eliminarlo.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 BA.debugLineNum = 88;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 91;BA.debugLine="Dim wyvernId As Int";
Debug.ShouldStop(67108864);
_wyvernid = RemoteObject.createImmutable(0);Debug.locals.put("wyvernId", _wyvernid);
 BA.debugLineNum = 92;BA.debugLine="Dim tipoId As Int";
Debug.ShouldStop(134217728);
_tipoid = RemoteObject.createImmutable(0);Debug.locals.put("tipoId", _tipoid);
 BA.debugLineNum = 93;BA.debugLine="Try";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 94;BA.debugLine="wyvernId = txtId.Text";
Debug.ShouldStop(536870912);
_wyvernid = BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText"));Debug.locals.put("wyvernId", _wyvernid);
 BA.debugLineNum = 95;BA.debugLine="tipoId = txtTipo.Text";
Debug.ShouldStop(1073741824);
_tipoid = BA.numberCast(int.class, parent.mostCurrent._txttipo.runMethod(true,"getText"));Debug.locals.put("tipoId", _tipoid);
 Debug.CheckDeviceExceptions();
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
 BA.debugLineNum = 97;BA.debugLine="MsgboxAsync(\"Los IDs deben ser numéricos.\", \"Err";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Los IDs deben ser numéricos.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 BA.debugLineNum = 98;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
;
 BA.debugLineNum = 101;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(16);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 102;BA.debugLine="peticion.Initialize(\"jobDelete\", Me)";
Debug.ShouldStop(32);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("jobDelete")),(Object)(main.getObject()));
 BA.debugLineNum = 105;BA.debugLine="Dim url As String = \"https://6637fe834253a866a24c";
Debug.ShouldStop(256);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/"),_tipoid,RemoteObject.createImmutable("/Wyverns/"),_wyvernid);Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 106;BA.debugLine="Log(\"URL de la solicitud DELETE: \" & url)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","1327707",RemoteObject.concat(RemoteObject.createImmutable("URL de la solicitud DELETE: "),_url),0);
 BA.debugLineNum = 109;BA.debugLine="peticion.Delete(url)";
Debug.ShouldStop(4096);
_peticion.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 112;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btneliminar_click"), (_peticion));
this.state = 20;
return;
case 20:
//C
this.state = 14;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 113;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(65536);
if (true) break;

case 14:
//if
this.state = 19;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 114;BA.debugLine="MsgboxAsync(\"Wyvern eliminado!\", \"Éxito\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Wyvern eliminado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),main.processBA);
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 116;BA.debugLine="Log(\"Error: \" & respuesta.ErrorMessage)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","1327717",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 117;BA.debugLine="Log(\"Respuesta: \" & respuesta.GetString)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","1327718",RemoteObject.concat(RemoteObject.createImmutable("Respuesta: "),_respuesta.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 118;BA.debugLine="MsgboxAsync(\"No se pudo eliminar. \" & respuesta.";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo eliminar. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 121;BA.debugLine="peticion.Release";
Debug.ShouldStop(16777216);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static void  _btninsertar_click() throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,166);
if (RapidSub.canDelegate("btninsertar_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","btninsertar_click"); return;}
ResumableSub_btnInsertar_Click rsub = new ResumableSub_btnInsertar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInsertar_Click extends BA.ResumableSub {
public ResumableSub_btnInsertar_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _nombre = RemoteObject.createImmutable("");
RemoteObject _elemento = RemoteObject.createImmutable("");
RemoteObject _tipo = RemoteObject.createImmutable("");
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,166);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 167;BA.debugLine="Dim map As Map";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 168;BA.debugLine="Dim json As String";
Debug.ShouldStop(128);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 169;BA.debugLine="Dim jsonGenerator As JSONGenerator";
Debug.ShouldStop(256);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGenerator", _jsongenerator);
 BA.debugLineNum = 172;BA.debugLine="Dim nombre As String = txtNombre.Text";
Debug.ShouldStop(2048);
_nombre = parent.mostCurrent._txtnombre.runMethod(true,"getText");Debug.locals.put("nombre", _nombre);Debug.locals.put("nombre", _nombre);
 BA.debugLineNum = 173;BA.debugLine="Dim elemento As String = txtElemento.Text";
Debug.ShouldStop(4096);
_elemento = parent.mostCurrent._txtelemento.runMethod(true,"getText");Debug.locals.put("elemento", _elemento);Debug.locals.put("elemento", _elemento);
 BA.debugLineNum = 174;BA.debugLine="Dim tipo As String = GetKeyFromValue(tiposWyverns";
Debug.ShouldStop(8192);
_tipo = _getkeyfromvalue(parent.mostCurrent._tiposwyverns,parent.mostCurrent._acttipo.runMethod(true,"getText"));Debug.locals.put("tipo", _tipo);Debug.locals.put("tipo", _tipo);
 BA.debugLineNum = 175;BA.debugLine="If tipo = \"\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 176;BA.debugLine="MsgboxAsync(\"Tipo de Wyvern no válido.\", \"Error\"";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Tipo de Wyvern no válido.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 BA.debugLineNum = 177;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 181;BA.debugLine="map.Initialize";
Debug.ShouldStop(1048576);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 182;BA.debugLine="map.Put(\"Nombre\", nombre)";
Debug.ShouldStop(2097152);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((_nombre)));
 BA.debugLineNum = 183;BA.debugLine="map.Put(\"Elemento\", elemento)";
Debug.ShouldStop(4194304);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Elemento"))),(Object)((_elemento)));
 BA.debugLineNum = 184;BA.debugLine="map.Put(\"Tipo_WyvernId\", tipo)";
Debug.ShouldStop(8388608);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_WyvernId"))),(Object)((_tipo)));
 BA.debugLineNum = 187;BA.debugLine="jsonGenerator.Initialize(map)";
Debug.ShouldStop(67108864);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_map));
 BA.debugLineNum = 188;BA.debugLine="json = jsonGenerator.ToPrettyString(2)";
Debug.ShouldStop(134217728);
_json = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("json", _json);
 BA.debugLineNum = 191;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(1073741824);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 192;BA.debugLine="peticion.Initialize(\"jobInsertar\", Me)";
Debug.ShouldStop(-2147483648);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("jobInsertar")),(Object)(main.getObject()));
 BA.debugLineNum = 193;BA.debugLine="peticion.PostString(\"https://6637fe834253a866a24c";
Debug.ShouldStop(1);
_peticion.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/")),(Object)(_json));
 BA.debugLineNum = 194;BA.debugLine="peticion.GetRequest.SetContentType(\"application/j";
Debug.ShouldStop(2);
_peticion.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 197;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btninsertar_click"), (_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 198;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(32);
if (true) break;

case 5:
//if
this.state = 10;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 199;BA.debugLine="MsgboxAsync(\"Wyvern creado.\", \"Éxito\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Wyvern creado.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),main.processBA);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 201;BA.debugLine="MsgboxAsync(\"No se pudo crear wyvern. \" & respue";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo crear wyvern. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 205;BA.debugLine="peticion.Release";
Debug.ShouldStop(4096);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static void  _cargartiposdewyvern() throws Exception{
try {
		Debug.PushSubsStack("CargarTiposDeWyvern (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,41);
if (RapidSub.canDelegate("cargartiposdewyvern")) { b4a.example.main.remoteMe.runUserSub(false, "main","cargartiposdewyvern"); return;}
ResumableSub_CargarTiposDeWyvern rsub = new ResumableSub_CargarTiposDeWyvern(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargarTiposDeWyvern extends BA.ResumableSub {
public ResumableSub_CargarTiposDeWyvern(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _peticion = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _listatipos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tipo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarTiposDeWyvern (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,41);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 42;BA.debugLine="Dim peticion As HttpJob";
Debug.ShouldStop(512);
_peticion = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("peticion", _peticion);
 BA.debugLineNum = 43;BA.debugLine="peticion.Initialize(\"JobTiposDeWyvern\", Me)";
Debug.ShouldStop(1024);
_peticion.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("JobTiposDeWyvern")),(Object)(main.getObject()));
 BA.debugLineNum = 44;BA.debugLine="peticion.Download(\"https://6637fe834253a866a24c8f";
Debug.ShouldStop(2048);
_peticion.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern")));
 BA.debugLineNum = 45;BA.debugLine="Wait For (peticion) JobDone(respuesta As HttpJob)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cargartiposdewyvern"), (_peticion));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 47;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 10;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 48;BA.debugLine="Dim json As String = respuesta.GetString";
Debug.ShouldStop(32768);
_json = _respuesta.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 49;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(65536);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 50;BA.debugLine="jsonParser.Initialize(json)";
Debug.ShouldStop(131072);
_jsonparser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 52;BA.debugLine="Dim listaTipos As List = jsonParser.NextArray";
Debug.ShouldStop(524288);
_listatipos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listatipos = _jsonparser.runMethod(false,"NextArray");Debug.locals.put("listaTipos", _listatipos);Debug.locals.put("listaTipos", _listatipos);
 BA.debugLineNum = 53;BA.debugLine="tiposWyverns.Initialize";
Debug.ShouldStop(1048576);
parent.mostCurrent._tiposwyverns.runVoidMethod ("Initialize");
 BA.debugLineNum = 54;BA.debugLine="Dim items As List";
Debug.ShouldStop(2097152);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 55;BA.debugLine="items.Initialize";
Debug.ShouldStop(4194304);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="For Each tipo As Map In listaTipos";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//for
this.state = 7;
_tipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group13 = _listatipos;
index13 = 0;
groupLen13 = group13.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("tipo", _tipo);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index13 < groupLen13) {
this.state = 6;
_tipo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group13.runMethod(false,"Get",index13));Debug.locals.put("tipo", _tipo);}
if (true) break;

case 13:
//C
this.state = 12;
index13++;
Debug.locals.put("tipo", _tipo);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 58;BA.debugLine="tiposWyverns.Put(tipo.Get(\"id\"), tipo.Get(\"Nomb";
Debug.ShouldStop(33554432);
parent.mostCurrent._tiposwyverns.runVoidMethod ("Put",(Object)(_tipo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),(Object)(_tipo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 BA.debugLineNum = 59;BA.debugLine="items.Add(tipo.Get(\"Nombre\"))";
Debug.ShouldStop(67108864);
_items.runVoidMethod ("Add",(Object)(_tipo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("tipo", _tipo);
;
 BA.debugLineNum = 62;BA.debugLine="actTipo.SetItems(items)";
Debug.ShouldStop(536870912);
parent.mostCurrent._acttipo.runVoidMethod ("SetItems",main.processBA,(Object)(_items));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 64;BA.debugLine="MsgboxAsync(\"No se pudo obtener la lista de tipo";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se pudo obtener la lista de tipos de wyvern. "),_respuesta.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.processBA);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 67;BA.debugLine="peticion.Release";
Debug.ShouldStop(4);
_peticion.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _getkeyfromvalue(RemoteObject _map,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetKeyFromValue (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("getkeyfromvalue")) { return b4a.example.main.remoteMe.runUserSub(false, "main","getkeyfromvalue", _map, _value);}
int _i = 0;
Debug.locals.put("map", _map);
Debug.locals.put("value", _value);
 BA.debugLineNum = 70;BA.debugLine="Private Sub GetKeyFromValue(map As Map, value As S";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="For i = 0 To map.Size - 1";
Debug.ShouldStop(64);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_map.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 72;BA.debugLine="If map.GetValueAt(i) = value Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))),(_value))) { 
 BA.debugLineNum = 73;BA.debugLine="Return map.GetKeyAt(i)";
Debug.ShouldStop(256);
if (true) return BA.ObjectToString(_map.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 76;BA.debugLine="Return \"\"";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private txtId As EditText";
main.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private txtNombre As EditText";
main.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtElemento As EditText";
main.mostCurrent._txtelemento = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private txtTipo As EditText";
main.mostCurrent._txttipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private actTipo As AutoCompleteEditText";
main.mostCurrent._acttipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private tiposWyverns As Map";
main.mostCurrent._tiposwyverns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
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
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}