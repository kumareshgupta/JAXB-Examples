package com.manipal.jaxb.demo;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"name", "location"})
public class LeadRole {
	private String name;
	private String location;
	
	public LeadRole(){}
	
	public LeadRole(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
