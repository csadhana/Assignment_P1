package com.sl.phase1.practiseproject;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidationOfEmailId {
	public static boolean ValidEmailid(String email)
	{
		String regex = "^(.+)@(.+)$";
		Pattern pa = Pattern.compile(regex);
		Matcher ma = pa.matcher(email);
		return ma.matches();
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> Email = new ArrayList<String>();
		Email.add("sadhana@example.com");
		Email.add("pujitha@example.com");
		Email.add("ram@.example com");
		Email.add("meghana example.com");
		Email.add("sai.sri @example.com");
		for(String value : Email)
		{
			System.out.println("The Email id" + value + "is" + (ValidEmailid(value) ? "valid" : " invalid"));
		}
		System.out.println("Enter Email Id:");
		String input = sc.nextLine();
		System.out.println("The Email id" + input + "is" + (ValidEmailid(input) ? "valid" : "invalid"));
				
	}

}
