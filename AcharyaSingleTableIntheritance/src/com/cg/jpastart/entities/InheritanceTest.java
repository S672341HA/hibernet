package com.cg.jpastart.entities;
import javax.persistance. EntityManager;


public class InheritanceTest {

	public static void main string[] args){
		EntityMangerFactory factory = Persistance.createEntityManagerFActory("JPA-PU");
		EntityManger em =factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("John");
		employee.setSalary(5000);
		em.persist(employee);
		
		// create one manager
		Manager manager =new Manager();
		manager.setName("Trisha");  
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		em.getTransaction().commit();
	System.out.println("Added one emloyee and manager to database.");
	em.close();
	factory.close();
	}

		
	}
}
