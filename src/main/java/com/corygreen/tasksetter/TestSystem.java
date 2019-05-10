package com.corygreen.tasksetter;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestSystem {
/*	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("tasksetter");
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		addUser(1, "Sue Smith", "suesmith@example.com", "suerocks");
//		addUser(2, "Sam Smith", "samsmith@example.com", "samrocks");
//		addUser(3, "Sid Smith", "sidsmith@example.com", "sidrocks");
//		addUser(4, "Sally Smith", "sallysmith@example.com", "sallyrocks");
		getUser(1);
		getUsers();
		changeName(4, "Mark");
		deleteUser(3);
		ENTITY_MANAGER_FACTORY.close();
	}
	
	public static void addUser(int userID, String name, String email, String password) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		try {
			et = em.getTransaction();
			et.begin();
			User user = new User();
			user.setUserID(userID);
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			em.persist(user);
			et.commit();
		}
		catch(Exception ex) {
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
	}
	
	public static void getUser(int userID) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT u FROM User u WHERE u.userID=:user_id";
		TypedQuery<User> tq = em.createQuery(query, User.class);
		tq.setParameter("user_id", userID);
		User user = null;
		try {
			user = tq.getSingleResult();
			System.out.println(user.getName() + ", " + user.getEmail());
		}
		catch(NoResultException ex) {
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
	}
	
	public static void getUsers() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery = "SELECT u FROM User u WHERE u.userID IS NOT NULL";
		TypedQuery<User> tq = em.createQuery(strQuery, User.class);
		List<User> users;
		try {
			users = tq.getResultList();
			for (User user : users) {
				System.out.println(user.getName() + ", " + user.getEmail());
			}
		}
		catch(NoResultException ex) {
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
	}
	
	public static void changeName(int userID, String name) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		User user = null;
		try {
			et = em.getTransaction();
			et.begin();
			user = em.find(User.class, userID);
			user.setName(name);
			
			em.persist(user);
			et.commit();
		}
		catch(Exception ex) {
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
	}

	public static void deleteUser(int userID) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		User user = null;
		try {
			et = em.getTransaction();
			et.begin();
			user = em.find(User.class, userID);
			em.remove(user);
			
			em.persist(user);
			et.commit();
		}
		catch(Exception ex) {
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
	}*/
}
