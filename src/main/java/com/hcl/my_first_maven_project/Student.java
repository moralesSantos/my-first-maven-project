package com.hcl.my_first_maven_project;



public class Student {
	
	private int id; 
	private double gpa; 
	private String name; 
	
	
	public Student(int id, double gpa , String name) {
		this.id = id; 
		this.gpa = gpa; 
		this.name = name; 
	}
	
	
	public void setId( int id) {
		this.id = id; 
	}
	
	public int getId() {
		return id;  
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa; 
	}
	
	public double getGpa() {
		return gpa; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name; 
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
}
