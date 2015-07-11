package com.education.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.dao.PasswordDao;
import com.education.dao.StudentDao;
import com.education.entity.Acount;
import com.education.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	@Autowired
	PasswordDao passwordDao;
	
	@Override
	public Boolean login(String num, String password) {
		Student student = studentDao.getStudent(num);
		if(student == null){
			return false;
		}else{
			String pd = passwordDao.getPassword(num);
			if(pd == null){
				return false;
			}else{
				if(pd.equals(password)){
					return true;
				}else{
					return false;
				}
			}
		}
		
	}

}
