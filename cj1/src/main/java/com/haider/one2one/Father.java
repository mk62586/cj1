package com.haider.one2one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Father {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String fatherName;

}
