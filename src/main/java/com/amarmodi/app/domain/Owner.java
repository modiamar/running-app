package com.amarmodi.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Owner {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy = "owner")
	private Dog dog;

}
