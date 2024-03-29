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
public class Mobile {
	
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
    @GeneratedValue(generator="auto")
	private int mobileId;
	private String mobileName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="mob_per",
	joinColumns = @JoinColumn(name="mobileId"),
	inverseJoinColumns = @JoinColumn(name="pep"))
	
	private List<Person> person;
 // mobile many to many program with hibernatnate
}
