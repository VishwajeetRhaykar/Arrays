package com.pro.wings.arrays;

public class ArrayAddition {

	public static void main(String[] args) {
		ArrayAddition a = new ArrayAddition ();
		
		int [] x = {10,20,30};
		int [] y = {10,20,30,50};
		
		a.addArray(x, y);
		
		
		
	}

	public void addArray(int [] x, int []y)
	{
		if(x.length >= y.length)
		{
			int totalIndex = x.length ;
			 int [] a = new int [totalIndex];
			 for(int i = 0; i<x.length;i++)
			 {
				 if (i <y.length)
				 {
					 a[i]=x[i]+y[i];
				 }
				 else
				 {
					 a[i]=x[i];
				 }
			 }
			
		     System.out.println("Printing Addition of Array's");
			 for (int n:a)
			 {
				 System.out.println(n);
			 }
		}
		else
		{
			int totalIndex = y.length ;
			 int [] a = new int [totalIndex];
			 for(int i = 0; i<y.length;i++)
			 {
				 if (i <x.length)
				 {
					 a[i]=x[i]+y[i];
				 }
				 else
				 {
					 a[i]=y[i];
				 }
			 }
			
		     System.out.println("Printing Addition of Array's");
			 for (int n:a)
			 {
				 System.out.println(n);
			 }
		}
	}
}
