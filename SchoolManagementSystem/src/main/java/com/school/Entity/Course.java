package com.school.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	
	@Column(name="courseName")
	private String courseName;
	
	@Column(name="courseDesc")
	private String courseDesc;
	
	@OneToMany(mappedBy="course")
	private ExamResults examResults;
	
}
