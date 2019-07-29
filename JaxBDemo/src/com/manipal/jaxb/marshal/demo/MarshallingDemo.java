package com.manipal.jaxb.marshal.demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.manipal.jaxb.demo.LeadRole;
import com.manipal.jaxb.demo.Movie;

public class MarshallingDemo {

	public static void main(String[] args) throws JAXBException {

		Movie movie = new Movie(101, "Bahubali", new LeadRole("Prabhash", "Amravathi"), 858988954.00 );		
		JAXBContext context = JAXBContext.newInstance(Movie.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
		//marshaller.marshal(movie, System.out);
		marshaller.marshal(movie, new File("movie.xml"));
		
		
	}

}
