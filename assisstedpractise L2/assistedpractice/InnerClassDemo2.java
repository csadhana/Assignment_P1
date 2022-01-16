package com.sl.l2.assistedpractice;

public class InnerClassDemo2 {
	public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }

}
