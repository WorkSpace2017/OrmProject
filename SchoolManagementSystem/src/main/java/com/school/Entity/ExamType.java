package com.school.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="examtype")
public class ExamType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="examTypeId")
	private int examTypeId;
	@Column(name="examName")
	private String examName;
	@Column(name="examDisc")
	private String examDisc;
	
	@OneToMany(mappedBy="examtype")
	private Exam exam;
	
	
}
