package inTERVIEWpREP;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author AKSHAYAK
 * This class shows the example of usage of REFLECTION API to get the values of Othere class private variable str.
 */
public class RefelectionEX {
public static void main(String[] args) {
	new RefelectionEX().display();
	call_other(new Othere());
}
public static String getClassName(Object obj) {
	return obj.getClass().getName();
}
public void display() {
	System.out.println(getClassName(this));
}
public static void call_other(Othere othr) {
	Class cls=othr.getClass();
	try {
		Constructor construct=cls.getConstructor();
		Field fld=cls.getDeclaredField("str");
		fld.setAccessible(true);
		System.out.println("Before Value " +othr.method3());
		fld.set(othr, "Hello Google!!!");
		System.out.println("After Value " +othr.method3());
	} catch (NoSuchMethodException | SecurityException | NoSuchFieldException | IllegalArgumentException | IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}


class Othere {
	private String str="HElloo World!!!";
	public Othere() {}
	private void method1() {
		System.out.println("method1 is called");
	}
	public void method2() {
		System.out.println("method2 is called");
	}
	public String method3() {
		return str;
	}
}