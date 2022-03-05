package com.haider.many2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import lombok.Data;

@Data
@Entity
@Table
public class Person {
	
    @Id
    @GenericGenerator(name="auto",strategy = "increment")
    @GeneratedValue(generator ="auto")
	private int pep;
	private String personName;
	

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="mob_per",
	joinColumns = @JoinColumn(name="pep"),
	inverseJoinColumns = @JoinColumn(name="mobileId"))
	private List<Mobile> mobile;

}
