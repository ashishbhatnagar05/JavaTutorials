package com.practise.Reflection;

import java.lang.reflect.Field;

import org.junit.Test;

public class ReflectionFieldsTest extends ReflectionTest {
	@Test
	public void testFields() {
		showPublicField(Labrador.class);
		showAnyField(Labrador.class);
		showAllFields(Labrador.class);
		// there are other methods too which get modifiers and all

	}

	private void showPublicField(Class<?> clazz) {
		System.out.println("class: " + clazz.getName());
		Field field = null;
		try {
			field = clazz.getField("L_Owner");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(field);
	}

	private void showAnyField(Class<?> clazz) {
		System.out.println("class: " + clazz.getName());
		Field field = null;
		try {
			field = clazz.getDeclaredField("L_Owner");// it will get any field, even though it is private or protected
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(field);
	}

	private void showAllFields(Class<?> clazz) {
		System.out.println("class: " + clazz.getName());
		Field[] fields = null;
		try {
			fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field);
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Dog {
	private int id;
	protected String name;
	public String Owner;
}

class Labrador extends Dog {
	private int L_id;
	protected String L_name;
	public String L_Owner;
}