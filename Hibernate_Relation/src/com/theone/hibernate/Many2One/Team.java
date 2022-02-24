package com.theone.hibernate.Many2One;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Team {

	@Id
	private int teamId;
	private String teamName;
}
