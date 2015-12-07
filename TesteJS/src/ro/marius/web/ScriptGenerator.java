package ro.marius.web;

public class ScriptGenerator {
	public static String generateScript() {

		String script = "<script>" + "var msg = 'test';" + "alert(msg);" + "</script>";
		return script;
	}
}
