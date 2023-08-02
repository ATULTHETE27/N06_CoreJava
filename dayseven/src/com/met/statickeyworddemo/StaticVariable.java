package com.met.statickeyworddemo;

class Employee
{
	private int empId;
	private String name;
	private static String companyName="TNSIF";
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	public void display()
	{
		System.out.println(" Emp ID : "+this.getEmpId()+" "+"Emp Name : "+this.getName()+" "+"Company Name"+this.getCompanyName());

	}
	
}

public class StaticVariable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(1);
		e.setName("Atul");
		e.display();
		
		Employee e1 = new Employee();
		e1.setEmpId(2);
		e1.setName("Ankit");
		e1.display();
		
	}

}
