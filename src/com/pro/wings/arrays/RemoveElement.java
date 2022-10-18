package com.pro.wings.arrays;
import java.util.Scanner;
public class RemoveElement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RemoveElement r = new RemoveElement();
		int [] x = {10,20,30,40,50,60};
		
		System.out.println("Entre the Elemnt to remove from Array");
		
		int b = sc.nextInt();
		
		r.removeEle(x, b);
		
	}
	
	public void removeEle(int [] x,int b)
	{
		int [] y = new int [x.length-1];
		int k = 0;
		for (int i = 0; i<x.length;i++)
		{
			if(b!=x[i])
			{
				y[k] =x[i];
				k++;
			}
		}
		System.out.println("Printing Array after removing element");
		
		for (int num : y)
		{
			System.out.println(num);
		}
	}
	
	
}
