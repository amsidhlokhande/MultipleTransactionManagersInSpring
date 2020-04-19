package com.amsidh.mvc.service;

import java.util.List;

import com.amsidh.mvc.exception.NoStudentFoundException;
import com.amsidh.mvc.model.Student;

public interface StudentService {
	public void addStudent(Student student);

	public List<Student> getAllStudent() throws NoStudentFoundException;
}
