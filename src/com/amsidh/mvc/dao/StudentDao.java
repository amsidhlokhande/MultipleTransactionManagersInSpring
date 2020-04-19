package com.amsidh.mvc.dao;

import java.util.List;

import com.amsidh.mvc.exception.NoStudentFoundException;
import com.amsidh.mvc.model.Student;

public interface StudentDao {

	public void addStudent(Student student);
	public List<Student> getAllStudent() throws NoStudentFoundException; 
}
