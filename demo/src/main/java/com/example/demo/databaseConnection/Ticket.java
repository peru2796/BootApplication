package com.example.demo.databaseConnection;

import javax.persistence.Entity;

import org.hibernate.annotations.GeneratorType;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="nticketID")
	private Integer nticketID;
	@Column(name="sticketName",nullable = false)
	private String sticketName;
	@Column(name="nstatus")
	private Integer nstatus;
	
	@Column(name="sbookeddate")
	private Date sbookeddate;

	public Integer getNticketID() {
		return nticketID;
	}

	public void setNticketID(Integer nticketID) {
		this.nticketID = nticketID;
	}

	public String getSticketName() {
		return sticketName;
	}

	public void setSticketName(String sticketName) {
		this.sticketName = sticketName;
	}

	public Integer getNstatus() {
		return nstatus;
	}

	public void setNstatus(Integer nstatus) {
		this.nstatus = nstatus;
	}

	public Date getSbookeddate() {
		return sbookeddate;
	}

	public void setSbookeddate(Date sbookeddate) {
		this.sbookeddate = sbookeddate;
	}
	

}
