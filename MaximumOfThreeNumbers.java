/**************************************************
 * Purpose :  It is a program to print the maximum using Generics
 * @author Rosy Rupali
 * @since 11-06-2021
 * @version 1.0
 *************************************************/
package com.bridgelabz.generics;

public class MaximumOfThreeNumbers {

	// Determines the largest of three comparable Float values
	/**
	 * @param <T>
	 * @param x first argument
	 * @param y second argument 
	 * @param z third argument
	 * @return maximum value in float
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

		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.5, 2.3, 7.8, maximum(6.5, 2.3, 7.8));
	}

}
