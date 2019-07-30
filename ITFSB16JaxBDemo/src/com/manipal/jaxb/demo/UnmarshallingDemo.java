package com.manipal.jaxb.demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallingDemo {

	public static void main(String[] args) throws JAXBException {
		Employee employee = null;
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();				
		employee = (Employee) unmarshaller.unmarshal(new File("emp.xml"));	
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getAddress());


	}

}
