package example.spring.core;

import java.util.List;

//Need to provide setter for all the properties that will be specified in bean. For those properties which are being used by cons-arg, we need not provide setter method
public class Student {

	private int id;
	private String name;
	private String department;
	private List<Address> addresses;

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

// the constructor is private
	private Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

//need default constructor if we are creating bean without cons-args or property
//	public Student() {
//		super();
//	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void init() {
		Utilities.printInit(this);
	}
}
