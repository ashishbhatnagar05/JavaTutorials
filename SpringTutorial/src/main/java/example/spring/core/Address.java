package example.spring.core;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {

	private String flatNo;
	private String building;
	private String Locality;
	@Autowired
	// @Resource
	// @Inject
	private City city;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getLocality() {
		return Locality;
	}

	public void setLocality(String locality) {
		Locality = locality;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		Utilities.printInit(this);
		System.out.println("hashcode of city while Address bean creation:" + this.getCity().hashCode());
	}

}
