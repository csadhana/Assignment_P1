package com.sl.l2.assistedpractice;

public class InnerClassDemo1 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		InnerClassDemo1  ob=new InnerClassDemo1 ();  
		ob.display();  
		}

}
