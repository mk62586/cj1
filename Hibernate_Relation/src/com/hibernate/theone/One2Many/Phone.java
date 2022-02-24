package com.hibernate.theone.One2Many;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Phone {
@Id
private int phId;
private String phoneName;
private int price;

}
