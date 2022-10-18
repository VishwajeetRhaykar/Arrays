package com.pro.wings.arrays;

public class Average {

	public static void main(String[] args) {
		Average a = new Average();
		 int [] x = {10,20,30,40,50,60,70};
		//int [] x = {};
		a.arrayAverage(x);
		

	}
	
	public void arrayAverage(int [] x)
	{
		int sum = 0;
		int avg =0;
		for(int n : x)
		{
			sum += n;
		}
		
		if(sum != 0)
		{
			 avg = sum / x.length; 
		}
		
		System.out.println("Average of elements is : "+avg);
	}

}
