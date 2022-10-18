package com.pro.wings.arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		ArrayComparison a = new ArrayComparison();
		 int [] x = {10,20,30,40,50,60};
		 int [] y = {15,25,30,40,55,65};
		 a.compare(x,y);

	}

	public void compare(int[] x, int[] y) {
		int count = 0;
		if (x.length <= y.length) {
			for (int i = 0; i < x.length; i++) {
				if (x[i] == y[i]) {
					System.out.println("Same element in both array: " + x[i]);
					count++;
				}
			}
		}
			else {
				for (int i = 0; i < y.length; i++) {
					if (y[i] == x[i]) {
						System.out.println("Same element in both array: " + x[i]);
						count++;
					}
			}
		}
	}

}
