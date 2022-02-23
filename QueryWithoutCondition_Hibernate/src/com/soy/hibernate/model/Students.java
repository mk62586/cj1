package com.soy.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Students {

	@Id
	private int id;
	private String name;
	private String subject;
	private int mark;
}
