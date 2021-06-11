package com.bridgelabz.generics;

public class MaximumOfThreeNumbers {

	// Determines the largest of three comparable Float values
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

		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.2f\n\n", 6.5, 2.3, 7.8, maximum(6.5, 2.3, 7.8));
	}

}
