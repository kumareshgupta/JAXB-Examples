package com.manipal.jaxb.demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"movieId", "title", "leadRole", "budget"})
public class Movie {
	private int movieId;
	private String title;
	private LeadRole leadRole;
	private double budget;
	
	public Movie(){}
	
	public Movie(int movieId, String title, LeadRole leadRole, double budget) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.leadRole = leadRole;
		this.budget = budget;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//@XmlElement(name="role")
	public LeadRole getLeadRole() {
		return leadRole;
	}
	public void setLeadRole(LeadRole leadRole) {
		this.leadRole = leadRole;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	
	
}
