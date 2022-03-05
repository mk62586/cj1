package com.theone.hibernate.Many2One;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Player {

	@Id
	private int teamId;
	private String playerName;
	
	@ManyToOne(cascade = CascadeType.ALL)             
	@JoinColumn(referencedColumnName = "teamId")
	private Team team;
	
}
