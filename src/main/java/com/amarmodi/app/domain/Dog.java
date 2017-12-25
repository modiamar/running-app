package com.amarmodi.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dog {
	@Id
	@GeneratedValue
	private Long id;
	//Owner owns dog
	@ManyToOne()
	@JoinColumn(name="Project_Id")
	private Owner owner;
}
