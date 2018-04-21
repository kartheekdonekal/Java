package com.individualconcepts.org;

public class StaticAndNonStatic {

	
		
		int i = 13;
		int j=18;
		float height=5.8f;
		String name="Kartheek Donekal";
		double salary= 30000.00;
		long PhNo=97400719;
		
		static int Q=18;
		static int K=19;
		static float height1=5.9f;
		static String name1= "Jeevan kumar";
		static double Salary1=50000.00;
		static long PhNo1=963012545;
		
		public void test1()
		{
			System.out.println("Test1 non static");
		}
		
		public static void test2()
		{
			System.out.println("Test2 static ");
		}
		
		public void test3()
		{
			System.out.println("test3 is non static");
		}
		
		public static void test4()
		{
			System.out.println("Test4 is static");
		}
		
		public static void main(String[] args)
		{
			//To access Non static variables and methods we need to create the objects of the class because the non static members are accessed by the objects 
			
			StaticAndNonStatic obj = new StaticAndNonStatic();
			obj.test1();
			obj.test3();
			System.out.println(obj.i);
			System.out.println(obj.j);
			System.out.println(obj.name);
			System.out.println(obj.height);
			System.out.println(obj.salary);
			System.out.println(obj.PhNo);
			
			//To access static variables and methods we can directly access with the help of the class name , 
			//Because the static members belongs to class rather than and object so we need not create an Object
			
			StaticAndNonStatic.test2();
			StaticAndNonStatic.test4();
			System.out.println(StaticAndNonStatic.Q);
			System.out.println(StaticAndNonStatic.K);
			System.out.println(StaticAndNonStatic.name1);
			System.out.println(StaticAndNonStatic.height1);
			System.out.println(StaticAndNonStatic.Salary1);
			System.out.println(StaticAndNonStatic.PhNo1);
			//
			
			

	}

}
