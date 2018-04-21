package com.individualconcepts.org;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String name, reverse="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the string to check the palindrome ? ");
		name = sc.nextLine();
		
		int length = name.length();
		
		for(int i = length-1 ;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
			if(name.equals(reverse))
			{
				System.out.println("The given name is a palindrome");
			}
			else
			{
				System.out.println("The given name is not a palindrome");
			}
		}

	}

