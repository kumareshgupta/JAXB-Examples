package com.manipal.jaxb.demo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"empId", "empName", "address"})
public class Employee {
	private int empId;
	private String empName;
	private String address;
	private double salary;
	
	public Employee(){}
	
	public Employee(int empId, String empName, String address, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}
	@XmlAttribute
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@XmlElement(name="ename")
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@XmlTransient
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
