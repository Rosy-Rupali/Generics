package com.bridgelabz.generics;

public class MaximumOfThreeNumbers <T extends Comparable<T>> {

	T x, y, z;

	// Parameterised constructor
	public MaximumOfThreeNumbers(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T getMaximum() {
		return MaximumOfThreeNumbers.getMaximum(x, y, z);
	}

	// Determines the largest of three comparable objects
	public static <T extends Comparable<T>> T getMaximum(T x, T y, T z) {
		T max = x; // assume x is initially the largest

		if (y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}

		if (z.compareTo(max) > 0) {
			max = z; // z is the largest
		}
		return max; // return the largest integer
	}

}
