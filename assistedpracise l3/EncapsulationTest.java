package com.sl.l3.assistedprsctice;

public class EncapsulationTest {
	 public static void main (String[] args)  
	    { 
	        Encapsulation obj = new Encapsulation(); 
	        obj.setName("Harsh"); 
	        obj.setAge(19); 
	        obj.setRoll(51); 
	        System.out.println("My name: " + obj.getName()); 
	        System.out.println("My age: " + obj.getAge()); 
	        System.out.println("My roll: " + obj.getRoll());      
	    } 

}
