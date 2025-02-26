package com.Encapsulation;

class Student {
    private String studentId;
    private String name;
    private double[] grades;

    public Student(String studentId, String name, double[] grades) {
        this.studentId = studentId;
        this.name = name;
        this.grades = grades;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId != null && !studentId.isEmpty()) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid Student ID");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        if (grades != null && grades.length > 0) {
            this.grades = grades;
        } else {
            System.out.println("Invalid Grades");
        }
    }

    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("\nAverage Grade: " + calculateAverageGrade());
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        double[] grades = {90, 85, 88, 92, 87};
        Student student = new Student("S12345", "John Doe", grades);

        student.displayStudentDetails();

        student.setName("Jane Smith");
        double[] newGrades = {95, 93, 91, 94, 89};
        student.setGrades(newGrades);

        System.out.println("\nUpdated Student Details:");
        student.displayStudentDetails();
    }
}

