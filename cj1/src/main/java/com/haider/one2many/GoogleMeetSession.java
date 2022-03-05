package com.haider.one2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class GoogleMeetSession {
	
	@Id
	private int meetId;
	private String sessionOwner;
	
	private String course;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "meetId")
	private List <Users> users;
}
