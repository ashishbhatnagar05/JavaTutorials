package example.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class City {
	private String name;

	public String getName() {
		return name;
	}

//@Value could be used to provide a default value to the component
	@Autowired
	public void setName(@Value("Mumbai") String name) {
		this.name = name;
	}

	public void init() {
		Utilities.printInit(this);
	}
}
