package com.pro.wings.arrays;

public class ConcateArray {

	public static void main(String[] args) {
		int []x = {10,20,30};
		int []y = {40,50,60};
		
		ConcateArray ca = new ConcateArray();
		ca.concate(x, y);
		
	}

	public void concate(int []x,int [] y) {
		int totalIndex = x.length + y.length ;
		 int [] a = new int [totalIndex];
		 for(int i = 0; i<x.length;i++)
		 {
			 a[i]=x[i];
		 }
		 for(int j = 0,k=x.length; j<x.length;j++,k++)
		 {
			 a[k]=y[j];
		 }
		 
		 System.out.println("Printing Concate Array");
		 for (int n:a)
		 {
			 System.out.println(n);
		 }
	}
	
}
