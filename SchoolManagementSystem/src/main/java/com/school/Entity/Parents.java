package com.school.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="parents")
public class Parents {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pid")
	private int pid;
	
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
	
	@Column(name="phoneNo")
	private long phoneNo;
	
	@Column(name="mobileNo")
	private long mobileNo;
	


	public Parents() {
		super();
	}

	public Parents( String fname, String lname, String middleName, String emailId, Date dob, long phoneNo,
			long mobileNo) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.middleName = middleName;
		this.emailId = emailId;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.mobileNo = mobileNo;
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	@Override
	public String toString() {
		return "Parents [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", middleName=" + middleName
				+ ", emailId=" + emailId + ", dob=" + dob + ", phoneNo=" + phoneNo + ", mobileNo=" + mobileNo + "]";
	}


	
	
	
}
