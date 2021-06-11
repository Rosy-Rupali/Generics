package com.bridgelabz.generics;

public class GenericType {

	// Determines the largest of three comparable objects
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // assume x is initially the largest

		if (y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}

		if (z.compareTo(max) > 0) {
			max = z; // z is the largest
		}
		return max; // return the largest integer
	}

	public static void main(String[] args) {

		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 10, 3, 5, maximum(3, 5, 10));

		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.5, 2.3, 7.8, maximum(6.5, 2.3, 7.8));

		System.out.printf("Maximum of %s, %s and %s is %s\n\n", "Apple", "Peach", "Banana",
				maximum("Apple", "Peach", "Banana"));
	}

}
