package com.bridgelabz.generics;

public class MaximumOfThreeNumbers {

	// Determines the largest of three comparable String values
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

		System.out.printf("Maximum of %s, %s and %s is %s\n\n", "Apple", "Peach", "Banana", maximum("Apple", "Peach", "Banana"));
	}

}
