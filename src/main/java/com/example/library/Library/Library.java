package com.example.library.Library;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="library")
public class Library {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="lib_id")
	private Long id;
	@JsonManagedReference
	@OneToMany(mappedBy="lib", fetch = FetchType.EAGER)
	private List<Book> book;
	private String Location;

	
public Long getId() {
		return id;
	}

public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
}
