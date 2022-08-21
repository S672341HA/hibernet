package com.cg.jpastart.entities;
import javax.persistence. DiscriminatorValue;
@Entity

@DimscriminatorValue("MGR")// Value for manager rows in Discriminator column


public class Manager extends Employee
{
	private static final long serialVersionUID = IL;
	
	private String departmentName;
	public String getDepartmentNAME() {
		return departmentName;
		
		public void setDepartmentName(String departemntName) {
			this.departmentNAME=departmentName;
			 
		}
	}
	
