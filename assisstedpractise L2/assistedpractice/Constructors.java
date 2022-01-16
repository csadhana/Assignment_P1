package com.sl.l2.assistedpractice;

public class Constructors {
	public static void main(String[] args) {

		Employee emp1=new Employee();
		Employee emp2=new Employee();

		emp1.display();
		emp2.display();
	}

}
class Employee{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}