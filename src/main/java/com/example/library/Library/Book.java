package com.example.library.Library;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
//@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private Long price;
	private String Auther;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="lib_id", updatable = false)
	private Library lib;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public Book(Long id, String name, Long price, String auther, Library lib) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		Auther = auther;
		this.lib = lib;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getAuther() {
		return Auther;
	}
	public void setAuther(String auther) {
		Auther = auther;
	}
	public Library getLib() {
		return lib;
	}
	public void setLib(Library lib) {
		this.lib = lib;
	}
	public Long getId() {
		return id;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
