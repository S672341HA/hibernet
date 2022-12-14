 
	package com.cg.jpastart.entities;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class InheritanceTest {

		public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			
			//create one employee
			Employee employee = new Employee();
			employee.setName("Shashank N");
			employee.setSalary(5000);
			em.persist(employee);
			
			//create one manager
			Manager manager = new Manager();
			manager.setName("Rajesh");
			manager.setSalary(8000);
			manager.setDepartmentName("hr");
			em.persist(manager);
			
			
			em.getTransaction().commit();
			
			System.out.println("Added one employee and manager to database demo1.");
			//em.close();
			//factory.close();

		}

	}


