package com.practise.Reflection;

import javax.naming.directory.Attribute;

import org.junit.Test;

public class ReflectionInterfaceTest extends ReflectionTest {

	@Test
	public void testShowInterfaces() {
		showInterfaces(String.class);
		System.out.println("--------------");
		showInterfaces(Attribute.class);
	}

//we could also use clazz.getModifiers() and Modifiers for interface 
	static void showInterfaces(Class<?> clazz) {
		if (clazz.isInterface())
			System.out.println(clazz.getName() + " is an interface");
		else {
			System.out.println(clazz.getName() + " is a class");
		}
		Class<?>[] interfaces = clazz.getInterfaces();
		for (Class<?> intf : interfaces) {
			System.out.println(intf.getName());
		}
	}
}
