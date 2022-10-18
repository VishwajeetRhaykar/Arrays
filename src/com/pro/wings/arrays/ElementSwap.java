package com.pro.wings.arrays;
import java.util.Scanner;
public class ElementSwap {

	public static void main(String[] args) {
		ElementSwap es = new ElementSwap();
		
		Scanner sc = new Scanner(System.in);
		int[] x= {10,20,30,40,50,60,70};
		
		System.out.println("Entre the First Element");
		int a = sc.nextInt();
		System.out.println("Entre the First Element");
		int b = sc.nextInt();
		
		es.swapElement(x, a, b);
		System.out.println("Printing the Array after change");
		for (int n : x)
		{
			System.out.println(n);
		}
	}
	
	public void swapElement(int[] x,int a, int b)
	{
		int index1=0;
		int index2=0;

		for(int i =0; i< x.length;i++)
		{
			if(a == x[i] )
			{
				index1 =i;
				
			}
			else if(b == x[i] )
			{
				index2 =i;
			}
//			else
//			{
//				System.out.println("Elements not found in array");
//			}
		}
		
		for(int i =0;i< x.length;i++)
		{
			if(index1 == i )
			{
				x[i]=b;
			}
			else if(index2 == i )
			{
				x[i]=a;
			}
		}
		
	}

}
