package com.haider.many2one;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table
    
public class State {

	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator ="auto")    
	private int stId;
	private String stateName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "ctId")
	private Country country;
	
}
