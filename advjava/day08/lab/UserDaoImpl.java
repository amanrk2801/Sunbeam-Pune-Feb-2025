package com.sunbeam.dao;

import static com.sunbeam.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sunbeam.pojos.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User signIn(String email, String pwd)  {
				return null;
	}

	@Override
	public String signUp(User newUser)  {
		String mesg="reg failed !!!!!!";
		//1. get session from SF
		Session session=getFactory().getCurrentSession();
		//2. begin tx
		Transaction tx=session.beginTransaction();
		try {
			//transient -> persistent
			session.persist(newUser);
			tx.commit();
			mesg="user registered with ID "+newUser.getUserId();
		} catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}		
		return mesg;
	}

	@Override
	public String updateVotingStatus(Long voterId)  {
	
		return "voting failed !!!!!!";

	}

	@Override
	public String updateUserDetails(Long userId, String newPassword, LocalDate dob)  {
		return "Details updation failed!!!!!!";
	}

	@Override
	public String deleteUser(Long userId)  {
		return null;
	}

	@Override
	public List<User> listUsers()  {
		List<User> users=null;
		String jpql="select u from User u";
		// 1. Get Session from SessionFactory
				Session session=getFactory().getCurrentSession();
				//2. Begin Tx
				Transaction tx=session.beginTransaction();
				try {
					users=session.createQuery(jpql,User.class)
							.getResultList();
					tx.commit();
				} catch (RuntimeException e) {
					if(tx != null)
						tx.rollback();
					//re throw the exception to the caller
					throw e;
				}
			return users;
	}

	@Override
	public User getUserDetails(Long userId)  {
	
		return null;

	}

}
