package com.manipal.jaxb.demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallingDemo {
	public static void main(String[] args) throws JAXBException {
		//object is ready
		Employee employee = new Employee(100, "Avinash", "Nellore", 95000.00);
		//EmployeeOne employee = new EmployeeOne(100, "Avinash", new Address(444,"Java Street", "Nellore"), 95000.00);
		//JAXBContext
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(employee, System.out);	
		
		marshaller.marshal(employee, new File("emp.xml"));
	}

}
