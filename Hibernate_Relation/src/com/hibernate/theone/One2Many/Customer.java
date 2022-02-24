package com.hibernate.theone.One2Many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

 @Data
 @Entity
public class Customer {

	 @Id
	private int phId;
	private String customerName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "phId")
	private List<Phone> phone;
	
	
}
