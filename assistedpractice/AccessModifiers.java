package com.sl.l1.assistedpractice;

public class AccessModifiers {
	public static void main(String[] args) {
		System.out.println("Dafault Access Specifier");
		AccessSpecifiers as = new AccessSpecifiers(); 		  
        as.display(); 
	}
}
	class AccessSpecifiers{
		 void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	}


