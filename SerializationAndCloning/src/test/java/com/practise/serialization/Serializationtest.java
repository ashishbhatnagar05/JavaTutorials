package com.practise.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.practise.model.College;
import com.practise.model.Student;

public class Serializationtest {

	@Test
	public void testSerialize() {
		final Student obj = new Student();
		obj.setId(1);
		obj.setName("ashish");
		College college = new College();
		college.setName("IIT-M");
		obj.setCollege(college);
		System.out.println("College object while serialization: " + college);
		Student.Location = "Pune";
		final String filename = "obj.ser";
		final FileOutputStream fos;
		final ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);
			try {
				oos.writeObject(obj);
				Student.Location = "gwalior";//
			} finally {
				oos.close();
				fos.close();
			}
		} catch (IOException e) {
			throw new AssertionError(e);

		}
	}

	@Test
	public void testDeserialize() {
		Student obj = null;
		final String filename = "obj.ser";
		final FileInputStream fis;
		final ObjectInputStream ois;
		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			try {
				obj = (Student) ois.readObject();
				System.out.println("id: " + obj.getId() + " name: " + obj.getName() + " location: " + Student.Location
						+ " Collge: " + obj.getCollege() + " College Name:" + obj.getCollege().getName());

			} finally {
				fis.close();
				ois.close();
			}
		} catch (IOException e) {
			throw new AssertionError(e);

		} catch (ClassNotFoundException e) {
			throw new AssertionError(e);

		}
	}
}