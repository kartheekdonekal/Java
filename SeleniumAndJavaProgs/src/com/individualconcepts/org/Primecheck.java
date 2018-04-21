package com.individualconcepts.org;

import java.util.Scanner;

public class Primecheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of num");
		int num = sc.nextInt();
		
			if((num%2)!=0)
			{
				System.out.println("The given number is prime"+num);
			}
			else
			{
				System.out.println("The given number is not prime"+num);
			}
		}
	}


