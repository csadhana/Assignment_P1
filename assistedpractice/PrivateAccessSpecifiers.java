package com.sl.l1.assistedpractice;

public class PrivateAccessSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Private Access Specifier");
		Private p = new Private();

	}

}
class Private 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 
