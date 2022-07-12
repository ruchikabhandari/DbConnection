package com.db.connection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;  

@Entity  
//defining class name as Table name  
@Table  
public class NameDto   
{  
public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String colour) {
		this.color = colour;
	}
//mark id as primary key  
@Id  
//defining id as column name  
@Column  
private int id;  
//defining name as column name  
@Column  
private int parentid;  
//defining age as column name  
@Column  
private String name;  
//defining email as column name  
@Column  
private String color;
}
