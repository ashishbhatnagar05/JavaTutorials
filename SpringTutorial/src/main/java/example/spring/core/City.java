package example.spring.core;

import org.springframework.stereotype.Component;

@Component
public class City {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		Utilities.printInit(this);
	}
}
