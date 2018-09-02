package com.practise.Reflection;

import javax.swing.JButton;

import org.junit.Test;

public class ReflectionCreateObjectTest extends ReflectionTest {
	@Test
	public void testJButton() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		JButton button = createObject("javax.swing.JButton");
		System.out.println(button.getClass().getName());
		Person person = createObject("com.practise.Reflection.Person");
		System.out.println(person.getClass().getName());
	}

	@SuppressWarnings("unchecked")
	static <T> T createObject(String className)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (T) Class.forName(className).newInstance();
	}
}

class Person {
	private int field1;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int field1) {
		super();
		this.field1 = field1;
	}

}