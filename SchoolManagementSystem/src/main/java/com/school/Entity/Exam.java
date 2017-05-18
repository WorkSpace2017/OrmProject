package com.school.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="exam" )
public class Exam {

	@Column(name="examId")
	private int examId;

	@Column(name="name")
	private String name;

	@Column(name="startDate")
	private Date startDate;
	
	@OneToMany(mappedBy="exam")
	private ExamResults examResults;
	
	@ManyToOne
	@JoinColumn(name="examTypeId",nullable=false)
	private ExamType examType;
	
}
