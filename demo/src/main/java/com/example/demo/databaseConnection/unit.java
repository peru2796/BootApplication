package com.example.demo.databaseConnection;

import org.hibernate.annotations.GeneratorType;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="unit")
public class unit {
	@Id
	@Column(name="nunitcode" )  private int nunitcode;
	@Column(name="sunitname", length=100 )  private String sunitname;
	@Column(name="sdescription", length=255 )  private String sdescription;
	@Column(name="nstatus" )  private int nstatus;
	@Column(name="nmasterauditcode") private int nmasterauditcode;
	// added by bhavani for nsitecode
	@Column(name="nsitecode") private int nsitecode;
	@Column(name="ndefaultstatus") private int ndefaultstatus;
	public int getNunitcode() {
		return nunitcode;
	}
	public void setNunitcode(int nunitcode) {
		this.nunitcode = nunitcode;
	}
	public String getSunitname() {
		return sunitname;
	}
	public void setSunitname(String sunitname) {
		this.sunitname = sunitname;
	}
	public String getSdescription() {
		return sdescription;
	}
	public void setSdescription(String sdescription) {
		this.sdescription = sdescription;
	}
	public int getNstatus() {
		return nstatus;
	}
	public void setNstatus(int nstatus) {
		this.nstatus = nstatus;
	}
	public int getNmasterauditcode() {
		return nmasterauditcode;
	}
	public void setNmasterauditcode(int nmasterauditcode) {
		this.nmasterauditcode = nmasterauditcode;
	}
	public int getNsitecode() {
		return nsitecode;
	}
	public void setNsitecode(int nsitecode) {
		this.nsitecode = nsitecode;
	}
	public int getNdefaultstatus() {
		return ndefaultstatus;
	}
	public void setNdefaultstatus(int ndefaultstatus) {
		this.ndefaultstatus = ndefaultstatus;
	}

}
