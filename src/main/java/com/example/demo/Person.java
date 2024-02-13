package com.example.demo;



import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	
	@OneToMany(mappedBy="person",cascade=CascadeType.ALL)
	private Set<Movie>movie;
	
	Person()
	{
		
	}

	public Person(int id, String name, String address, Set<Movie> movie) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.movie = movie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Movie> getMovie() {
		return movie;
	}

	public void setMovie(Set<Movie> movie) {
		this.movie = movie;
	}
	
	

}
