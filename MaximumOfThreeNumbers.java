/**************************************************
 * Purpose :  It is a program to print the maximum using Generics
 * @author Rosy Rupali
 * @since 11-06-2021
 * @version 1.0
 *************************************************/
package com.bridgelabz.generics;

public class MaximumOfThreeNumbers {

	// Determines the largest of three comparable integers
	/**
	 * @param <T>
	 * @param x first integer
	 * @param y second integer
	 * @param z third integer
	 * @return maximum value
	 */
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
	}

}
