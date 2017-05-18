package com.school.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.engine.Cascade;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	
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
	
	@Column(name="dateOfJoin")
	private Date dateOfJoin;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pid")
	private Parents parents;

	public Student() {
		super();
	}

	public Student(String fname, String lname, String middleName, String emailId, Date dob, long phoneNo,
			long mobileNo, Date dateOfJoin, String status,Parents parents) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.middleName = middleName;
		this.emailId = emailId;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.mobileNo = mobileNo;
		this.dateOfJoin = dateOfJoin;
		this.status = status;
		this.parents = parents;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public Parents getParents() {
		return parents;
	}

	public void setParents(Parents parents) {
		this.parents = parents;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", middleName=" + middleName
				+ ", emailId=" + emailId + ", dob=" + dob + ", phoneNo=" + phoneNo + ", mobileNo=" + mobileNo
				+ ", dateOfJoin=" + dateOfJoin + ", status=" + status + ", parents=" + parents + "]";
	}
	
	
	
}
