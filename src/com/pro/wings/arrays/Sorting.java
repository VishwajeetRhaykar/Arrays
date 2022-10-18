package com.pro.wings.arrays;

public class Sorting {

	public static void main(String[] args) {
		Sorting s = new Sorting();

		int[] x = { 40, 25, 80, 10,30, 50, 70, 60 };
		s.ascending(x);
	//	s.decending(x);

		for (int n : x) {
			System.out.println(n);
		}
		
		System.out.println("Sencond largest elemnet is "+(x[x.length-2]));
	}

	public void ascending(int[] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				
					if (x[i] > x[j]) {
						int a = x[i];
						x[i] = x[j];
						x[j] = a;
					}
				
			}
		}
	}

	public void decending(int[] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				
					if (x[i] < x[j]) {
						int a = x[i];
						x[i] = x[j];
						x[j] = a;
					}
				
			}
		}
	}
}
