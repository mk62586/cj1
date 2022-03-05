package com.haider.many2one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table
public class Country {

	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator ="auto")

	private int ctId;
	private String countryName;
		
}
