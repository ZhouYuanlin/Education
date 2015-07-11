package com.education.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.education.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	SessionFactory sessionFactory = null;
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public Student getStudent(String num) {
		String hql = "from Student student where S_num=?";
		List<Student> students = getSession().createQuery(hql).setString(0, num).list();
		System.out.println(students.get(0).getS_num());
		if(students.size() == 0){
			return null;
		}else {
			return students.get(0);
		}
		
	}

}
