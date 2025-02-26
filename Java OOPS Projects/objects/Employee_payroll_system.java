package com.objects;

class Employee{
	int employeeId, salary;
	String position,name;
	
	Employee(int employeeId,String name,String position,int salary){
		this.employeeId = employeeId;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public void displayEmployeeInfo(){
		System.out.println("Employee ID is : "+this. employeeId);
		System.out.println("Employee Name is : "+this. name);
		System.out.println("Employee Position is : "+this. position);
		System.out.println("Employee Salary is : "+this. salary);
		
	}
	public void calculateAnnualSalary(){
		System.out.println("Employee Annual Salary is : "+(12*salary));
	}
}

public class Employee_payroll_system {
	public static void main(String args[]){
		Employee emp = new Employee(1232,"Pranathi","Developer",150000);
		emp.displayEmployeeInfo();
		emp.calculateAnnualSalary();
	}
}
