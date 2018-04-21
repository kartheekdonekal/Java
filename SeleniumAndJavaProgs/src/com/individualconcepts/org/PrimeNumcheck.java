package com.individualconcepts.org;

public class PrimeNumcheck {

	public static boolean checkprimenum(int num) {
		
		

		
		boolean result = true;
		for(int i =2 ; i<=10 ;i++)
		{
			if(num%2==0)
			{
				result  = false ;
				break;
			}
			
		}
		return result;

	}
     
	public static void main(String args[])
	{
		int num =4;
		boolean result = checkprimenum(num);
		System.out.println(result);
	}
}
