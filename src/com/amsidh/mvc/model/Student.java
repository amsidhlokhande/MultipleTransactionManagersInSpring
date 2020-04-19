package com.amsidh.mvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5724014580332177648L;
	@Id
	private Integer studentId;
	private String studentName;
	private String stanard;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private Long mobileNumber;

	public Student() {

	}

	public Student(Integer studentId, String studentName, String stanard,
			Date dateOfBirth, Long mobileNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.stanard = stanard;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStanard() {
		return stanard;
	}

	public void setStanard(String stanard) {
		this.stanard = stanard;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {

		return studentId + "       " + studentName + "        " + stanard
				+ "       " + dateOfBirth + "       " + mobileNumber;
	}
}
