
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class wyvern {
    public static RemoteObject myClass;
	public wyvern() {
	}
    public static PCBA staticBA = new PCBA(null, wyvern.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static RemoteObject _elemento = RemoteObject.createImmutable("");
public static RemoteObject _tipo_wyvernid = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Elemento",_ref.getField(false, "_elemento"),"Id",_ref.getField(false, "_id"),"Nombre",_ref.getField(false, "_nombre"),"Tipo_WyvernId",_ref.getField(false, "_tipo_wyvernid")};
}
}