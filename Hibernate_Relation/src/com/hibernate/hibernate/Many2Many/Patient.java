package com.hibernate.hibernate.Many2Many;

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
public class Patient {

	@Id
	@GenericGenerator(name="auto",strategy = "increment")
    @GeneratedValue(generator="auto")
	private int patientId;
	private String patientName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="doc_pat",
	joinColumns = @JoinColumn(name="patientId"),
	inverseJoinColumns = @JoinColumn(name="did"))
	
	private List<Doctor> doctorAdd;
	
}
