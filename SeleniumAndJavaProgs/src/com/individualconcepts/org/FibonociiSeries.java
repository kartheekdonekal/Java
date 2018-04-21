package com.individualconcepts.org;

public class FibonociiSeries {

	public static void main(String[] args) {
		int num =10 , a =0, b= 1, c;
		
		System.out.println(a);
		System.out.println(b);
		c = a+b;
		System.out.println(c);
		
		for(int i = 1 ; i<=10 ;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}

	}

}
