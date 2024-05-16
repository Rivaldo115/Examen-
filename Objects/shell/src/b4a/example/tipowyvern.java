
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class tipowyvern {
    public static RemoteObject myClass;
	public tipowyvern() {
	}
    public static PCBA staticBA = new PCBA(null, tipowyvern.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Id",_ref.getField(false, "_id"),"Nombre",_ref.getField(false, "_nombre")};
}
}