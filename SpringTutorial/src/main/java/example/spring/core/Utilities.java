package example.spring.core;

public class Utilities {

	public static void printInit(Object obj) {
		System.out.println(obj.getClass().getSimpleName() + " initalized with object hashcode: " + obj.hashCode());

	}

	public void init() {
		printInit(this);
	}

}
