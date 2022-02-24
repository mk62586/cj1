package com.theone.hibernate.One2One;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int countryId;
	private String countryName;
}
