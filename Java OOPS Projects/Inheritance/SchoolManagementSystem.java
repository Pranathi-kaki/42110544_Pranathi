package com.Inheritance;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public void displayTeacherInfo() {
        displayInfo();
        System.out.println("Subject: " + subject);
    }

    public void calculateAnnualSalary() {
        System.out.println("Annual Salary: " + (salary * 12));
    }
}

class Student extends Person {
    String grade;
    String studentId;

    public Student(String name, int age, String grade, String studentId) {
        super(name, age);
        this.grade = grade;
        this.studentId = studentId;
    }

    public void displayStudentInfo() {
        displayInfo();
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentId);
    }

    public void calculateGrade() {
        System.out.println("Grade: " + grade);
    }
}


public class SchoolManagementSystem {
	 public static void main(String[] args) {
	        Teacher teacher = new Teacher("John Doe", 40, "Mathematics", 5000);
	        System.out.println("Teacher Details:");
	        teacher.displayTeacherInfo();
	        teacher.calculateAnnualSalary();

	        System.out.println("\n-----------------------------\n");

	        Student student = new Student("Alice Smith", 20, "A", "S12345");
	        System.out.println("Student Details:");
	        student.displayStudentInfo();
	        student.calculateGrade();
	    }
}
