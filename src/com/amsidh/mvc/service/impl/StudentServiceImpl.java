package com.amsidh.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amsidh.mvc.dao.StudentDao;
import com.amsidh.mvc.exception.NoStudentFoundException;
import com.amsidh.mvc.model.Student;
import com.amsidh.mvc.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Transactional
	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);

	}

	@Transactional
	@Override
	public List<Student> getAllStudent() throws NoStudentFoundException {
		return studentDao.getAllStudent();
	}

}
