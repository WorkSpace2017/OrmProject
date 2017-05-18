package com.school.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="examresults")
public class ExamResults {

    @ManyToOne
    @JoinColumn(name="sid",nullable=false)
	private Student student;

    @ManyToOne
    @JoinColumn(name="cid",nullable=false)
    private Course course;
   
    @ManyToOne
    @JoinColumn(name="examId", nullable=false)
    private Exam exam;
    
	@Column(name="marks")
	private int marks;
	
}
