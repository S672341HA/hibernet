package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client 
{
	public static void main(String[] args)
	{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	
	em.getTransaction().begin();
	
	//create dept
	Department department =new Department();
	department.setId(10);
	department.setName("C2TC");
	
	
	Department department1 =new Department();
	department.setId(10);
	department.setName("C2C");
	
	//Create instance Employee();
	Employee e1 =new Employee();
	e1.setName("Rajesh");
	e1.setSalary(760);
	
	Employee e2=new Employee();
	e1.setName("Manushree");
	e1.setSalary(1200);
	

	Employee e3=new Employee();
	e1.setName("Anirudh");
	e1.setSalary(1200);
	
	//Association emp to dept
	department.addEmployee(e1);
	department.addEmployee(e2);
	department.addEmployee(e3);
	
	em.persist(department);
	em.persist(department1);
	
	
	System.out.println("Added dept and added employee to the DB");
	em.getTransaction().commit();
	em.close();
	factory.close();
	
	
	
	
	
	
	}
}
