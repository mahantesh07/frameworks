package com.AutoGen.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="dominos_table")
public class DominosDTO implements Serializable {

	@Column(name="branch")
	private String branch;
	
	@Column(name="contactnum")
	private long contactno;
	
	@Id
	@GenericGenerator(name="generator", strategy="increment")
	@GeneratedValue(generator="generator")
	@Column(name="no_of_orders")
	private int numOforders;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public int getNumOforders() {
		return numOforders;
	}

	public void setNumOforders(int numOforders) {
		this.numOforders = numOforders;
	}

}
