package com.pro.wings.arrays;

public class Duplicate {
	int value;

	public static void main(String[] args) {
		Duplicate d = new Duplicate();
		int[] x = { 10,20,10,30,40,20,50 };

		System.out.println("Printing recived  Array ");

		for (int j = 0; j < x.length; j++) {
			System.out.println(x[j]);
		}

		System.out.println("length is " + x.length);

		d.removeDuplicate(x);
	}

	public void removeDuplicate(int[] x) {
		int count = 0;
		int v = 0;
		int[] y = new int[7];

		for (int i = 0; i < x.length; i++) {
			int repeat = 0;
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					value = x[i];
					count++;
					repeat++;
					System.out.println("Duplicate number is :" + value);
				}
				// if (x[j] != x[i])
			}
			if (repeat < 1) {
				y[v] = x[i];
				v++;
				}
		}
		System.out.println("Count is :"+ count);
		System.out.println("Printing Array after removing duplicate");
			
		int z[] = new int[x.length - count];
			for (int k = 0; k < z.length; k++) {
				z[k] = y[k];
				System.out.println(z[k]);
			}
	}
}
