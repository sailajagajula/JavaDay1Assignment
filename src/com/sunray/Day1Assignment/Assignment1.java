package com.sunray.Day1Assignment;

public class Assignment1 {
	public static void main(String[] args) {
		int n = 6;
		boolean b = PrimeorComp(n);
		if (b == true)
			System.out.println("" + n + " is prime");
		else
			System.out.println("" + n + " is composite");
		StringBuffer p = PatternDisplay(5);
		System.out.println("" + p);
		Integer[] array = { 1, 20, 5, 7, 4, 89, 0, 6, 7, 21 };
		int min = Smallest(array);
		int max = largest(array);
		System.out.println("min " + min + " max " + max);
	}

	private static int largest(Integer[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		return max;
	}

	private static int Smallest(Integer[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] < min)
				min = array[i];
		return min;
	}

	private static StringBuffer PatternDisplay(int n) {
		StringBuffer str = new StringBuffer("");
		for (int i = 1; i <= n; i++) {
			if (i != 1)
				str.append("\n");
			for (int j = 1; j <= i; j++)
				str.append(j + " ");
		}
		return str;
	}

	private static boolean PrimeorComp(int n) {
		boolean b = true;
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				b = false;
		return b;
	}
}
