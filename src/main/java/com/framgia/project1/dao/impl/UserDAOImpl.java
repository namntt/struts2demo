package com.framgia.project1.dao.impl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.framgia.project1.dao.UserDAO;
import com.framgia.project1.model.User;

public class UserDAOImpl implements UserDAO{
	private SessionFactory sf;
	
	public UserDAOImpl(SessionFactory sf){
		this.sf = sf;
	}

	public User checkLogin(String username, String password) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("select u from User u where u.username=:username and u.password=:password");
		query.setParameter("username", username); 
		query.setParameter("password", password);
		User user = (User) query.getSingleResult();
		if(user != null){
			System.out.println("User Retrieved from DB::"+user);
		}
		tx.commit();
		session.close();
		return user;
	}
	

}
