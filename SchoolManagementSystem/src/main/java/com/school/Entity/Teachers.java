package com.school.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class Teachers {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tid")
	private int tid;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="mobileNo")
	private long phoneNo;
	
	@Column(name="mobileNo")
	private long mobileNo;
	
	@Column(name="dateOfJoin")
	private Date dateOfJoin;
	
	@Column(name="status")
	private String status;

	public Teachers() {
		super();
	}

	public Teachers(int tid, String fname, String lname, String middleName, String emailId, Date dob, long phoneNo,
			long mobileNo, Date dateOfJoin, String status) {
		super();
		this.tid = tid;
		this.fname = fname;
		this.lname = lname;
		this.middleName = middleName;
		this.emailId = emailId;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.mobileNo = mobileNo;
		this.dateOfJoin = dateOfJoin;
		this.status = status;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
