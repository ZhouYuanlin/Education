package com.education.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.education.entity.Acount;

@Repository
public class PasswordDaoImpl implements PasswordDao {

	@Autowired
	SessionFactory sessionFactory = null;
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public String getPassword(String num) {
		String hql = "from Acount acount where num = ?";
		List<Acount> acounts = getSession().createQuery(hql).setString(0, num).list();
		System.out.println(acounts.get(0).getPassword());
		if(acounts.size() == 0){
			return null;
		}else{
			return acounts.get(0).getPassword();
		}
		
	}

}
