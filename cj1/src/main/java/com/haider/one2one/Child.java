package com.haider.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Child {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cId;
private  String childName;
private int age;
<<<<<<< HEAD
private String github;
=======
private int gitPractice;
//yyyyy
	//hello program

@OneToOne(cascade = CascadeType.ALL)
private Father fa;
	
}

