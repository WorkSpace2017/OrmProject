package com.school.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Attendence {

	@ManyToOne
	@JoinColumn(name="sid")
	private Student student;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="status")
	private String status;
	
	@Column(name="remarks")
	private String remarks;

	public Attendence() {
		super();
	}

	public Attendence(Student student, Date date, String status, String remarks) {
		super();
		this.student = student;
		this.date = date;
		this.status = status;
		this.remarks = remarks;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
