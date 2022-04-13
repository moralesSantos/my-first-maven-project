package com.hcl.my_first_maven_project;


import java.util.ArrayList;
import java.util.List;

public class PrintStudents {
	
	
	public static void main(String[] args) {
	
	List<Student> arr = new ArrayList<Student>();	
	
	
	Student student1 = new Student(1,3.0,"Mike");
	Student student2 = new Student(2,3.3,"Andy");
	Student student3 = new Student(3,2.0,"Zack");
	Student student4 = new Student(4,3.7,"Katey");
	
	
	printStudent(student1);
	printStudent(student2);
	printStudent(student3);
	printStudent(student4); 
	
	
	}
	
	public static void printStudent(Student student) {
	    System.out.printf("The student %s with id %s has gpa = %s\n",
	            student.getName(), student.getId(), student.getGpa()
	            );
	  }
	}
