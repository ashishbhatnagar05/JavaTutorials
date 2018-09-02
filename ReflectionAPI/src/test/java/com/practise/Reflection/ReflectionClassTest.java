package com.practise.Reflection;

import java.lang.reflect.Modifier;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.Test;

public class ReflectionClassTest extends ReflectionTest {

	@Test
	public void testClassSimpleMethods() {
		JButton button = new JButton();
		Class<?> clazzButton = button.getClass();
		System.out.println(clazzButton.getName());
		Class<?> clazzSocket = Socket.class;
		System.out.println("getName(): " + clazzSocket.getName());
		System.out.println("getSimpleName(): " + clazzSocket.getSimpleName());
		myObjectMethod(new String("abc"));
		myGenericsMethod(int.class);
		createClass("java.awt.Color");

	}

	@Test
	public void testClassHeirarchy() {
		showHierarchy(JTextField.class);
	}

	@Test
	public void testClassmodifiers() {
		checkClassForModifiers(String.class);
	}

	static void checkClassForModifiers(Class<String> clazz) {
		System.out.println("The class: " + clazz.getName());
		int mod = clazz.getModifiers();
		System.out.println("isPublic: " + Modifier.isPublic(mod));
		System.out.println("isStatic: " + Modifier.isStatic(mod));
		System.out.println("isAbstract: " + Modifier.isAbstract(mod));
		System.out.println("isFinal: " + Modifier.isFinal(mod));
		System.out.println("isInterface: " + Modifier.isInterface(mod));
		System.out.println("isPrivate: " + Modifier.isPrivate(mod));
		System.out.println("isSynchronized: " + Modifier.isSynchronized(mod));
		System.out.println("isTransient: " + Modifier.isTransient(mod));
		System.out.println("isVolatile: " + Modifier.isVolatile(mod));
		System.out.println("class " + clazz.getSimpleName() + " is: " + Modifier.toString(mod));
	}

	static void showHierarchy(Class<?> clazz) {
		if (clazz.getSuperclass() == null) {
			System.out.println("class name: " + clazz.getName());
			return;
		}
		showHierarchy(clazz.getSuperclass());
		System.out.println("class name: " + clazz.getName());
	}

	static void myObjectMethod(Object obj) {

		Class<?> clazz = obj.getClass();
		System.out.println("myObjectMethod: " + clazz.getName());
	}

	static <T> void myGenericsMethod(T obj) {

		Class<?> clazz = obj.getClass();
		System.out.println("myGenericsMethod: " + clazz.getName());
	}

	static void createClass(String name) {

		Class<?> clazz = null;
		try {
			clazz = Class.forName(name);
		} catch (ClassNotFoundException e) {
			// if the name is illegal
			e.printStackTrace();
		}
		System.out.println("createClass: " + clazz.getName());
	}

}
