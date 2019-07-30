package com.manipal.jaxb.demo;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"houseNo", "street", "city"})
public class Address {
	private int houseNo;
	private String street;
	private String city;
	
	public Address(){}
	public Address(int houseNo, String street, String city) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
