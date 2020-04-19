package com.amsidh.mvc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.amsidh.mvc.dao.StudentDao;
import com.amsidh.mvc.exception.NoStudentFoundException;
import com.amsidh.mvc.model.Student;
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addStudent(Student student) {
	 Session session=sessionFactory.openSession();
	 session.beginTransaction();
	 session.save(student);
	 	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudent() throws NoStudentFoundException {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Student> listOfStudent=(List<Student>)session.createQuery("from Student");
	    if(listOfStudent.isEmpty())
	    {
	    	throw new NoStudentFoundException("No Student Found");
	    }
		return listOfStudent;
	}

}
