package com.met.classobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		//object creation
		Employee e = new Employee();
		e.empId=123456789;
		e.empName="Atul Thete.";
		e.salary=99000;
		e.department="IT";
		//method call
		e.display();
	}

}
