package com.theone.hibernate.One2One;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class PrimeMinister {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pmID;
private String pmName;

@OneToOne(cascade = CascadeType.ALL)

private Country country;
	
  }
