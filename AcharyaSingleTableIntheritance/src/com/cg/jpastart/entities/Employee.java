package com.cg.jpastart.entities;

	import java.io.Serializable;
	 
@Entity
@Table(name="emp_store")
@inheritance(strategy= InheritanceType.SINGLE_TABLE)// This annotation must be written only on parent class
@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING) //additional column to differ parent and child
@DiscriminatorValue("EMP") //parent row will have this in Discriminator Column
public class Employee implements Serializable {
		/**
		 * 
		 */
		
		
	private static final long serialVersionUID = 1L;
	@Id
	private int employeetId;
	private String name;
	private double salary;
	private int employeeId;
public int getEmployee() {
	int employeeId;
	return employeeId;
}
	public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	
	}
	
	


