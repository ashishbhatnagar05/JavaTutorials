package com.practise.serialization;

import org.junit.Test;

public class CloningTest {
	@Test
	public void testShallowCloning() {
		System.out.println();
		System.out.println("----------------testShallowCloning---------------");
		Student student = new Student(1, "ashish");
		ShallowCloning original = new ShallowCloning(10, 20, student);
		ShallowCloning cloned = null;
		try {
			cloned = (ShallowCloning) original.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("Original object's hascode: " + original.hashCode());
		System.out.println("Cloned object's hashcode: " + cloned.hashCode());
		System.out.println("Original referenced object's hashcode: " + original.getStudent().hashCode());
		System.out.println("Cloned referenced object's hashcode: " + cloned.getStudent().hashCode());
		System.out.println(
				"Cloned object value: " + original + " Student object values: " + cloned.getStudent().hashCode());
	}

	@Test
	public void testDeepCloning() {
		System.out.println();
		System.out.println("----------------testDeepCloning---------------");
		Student student = new Student(1, "ashish");
		DeepCloning original = new DeepCloning(10, 20, student);
		DeepCloning cloned = null;
		try {
			cloned = (DeepCloning) original.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("Original object's hascode: " + original.hashCode());
		System.out.println("Cloned object's hashcode: " + cloned.hashCode());
		System.out.println("Original referenced object's hashcode: " + original.getStudent().hashCode());
		System.out.println("Cloned referenced object's hashcode: " + cloned.getStudent().hashCode());
		System.out.println(
				"Cloned object value: " + original + " Student object values: " + cloned.getStudent().hashCode());
	}

}

//An object reference of this class is
//contained by Test2
class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

//Contains a reference of Test and implements
//clone with shallow copy.
class ShallowCloning implements Cloneable {
	private int a;
	private int b;
	private Student student;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ShallowCloning(int a, int b, Student student) {
		super();
		this.a = a;
		this.b = b;
		this.student = student;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "ShallowCloning [a=" + a + ", b=" + b + ", student=" + student + "]";
	}

}

// Contains a reference of Test and implements
// clone with shallow copy.
class DeepCloning implements Cloneable {
	private int a;
	private int b;
	private Student student;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public DeepCloning(int a, int b, Student student) {
		super();
		this.a = a;
		this.b = b;
		this.student = student;
	}

	public Object clone() throws CloneNotSupportedException {
		DeepCloning deepCloning = (DeepCloning) super.clone();
		Student Student = new Student(this.getStudent().getId(), this.getStudent().getName());
		deepCloning.setStudent(Student);
		return deepCloning;
	}

	@Override
	public String toString() {
		return "DeepCloning [a=" + a + ", b=" + b + ", student=" + student + "]";
	}

}