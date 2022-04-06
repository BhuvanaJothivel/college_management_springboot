package com.college.abcinstitute.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Admission {
	
	@Id
	private int studentId;
	private String studentName;
	private String type;
//	private int courseId;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "admission")
	private Course course;

	public Admission(int studentId, String studentName, String type, Course course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.type = type;
		this.course = course;
	}

	public Admission() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
