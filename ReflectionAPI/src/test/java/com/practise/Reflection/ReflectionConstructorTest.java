package com.practise.Reflection;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class ReflectionConstructorTest extends ReflectionTest {
	@Test
	public void testConstructors() {
		showPublicConstructors(Student.class);
		System.out.println("------------");
		showAnyConstructor(Student.class);
		System.out.println("------------");
		showAllConstructors(Student.class);
		// there are other methods too which get modifiers and all

	}

	private void showPublicConstructors(Class<?> clazz) {
		System.out.println("class: " + clazz.getName());
		Constructor<?> constructor = null;
		try {
			constructor = clazz.getConstructor();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(constructor);
	}

	private void showAnyConstructor(Class<?> clazz) {
		System.out.println("class: " + clazz.getName());
		Constructor<?> constructor = null;

		try {
			constructor = clazz.getDeclaredConstructor(int.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // it will get any field, even though it is private or protected

		System.out.println(constructor);
	}

	private void showAllConstructors(Class<?> clazz) {
		System.out.println("class: " + clazz.getName());
		Constructor<?>[] constructors = null;
		try {
			constructors = clazz.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.println(constructor);
				System.out.println("parameters type: " + constructor.getParameterTypes());
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Student {

	public Student() {

	}

	protected Student(int a) {

	}

	private Student(String a, int b) {

	}

}
