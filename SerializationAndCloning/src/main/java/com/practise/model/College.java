package com.practise.model;

import java.io.Serializable;

public class College implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2351044455673331828L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String string) {
		this.name = string;
	}
}