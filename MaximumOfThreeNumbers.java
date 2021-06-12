/**************************************************
 * Purpose :  It is a program to print the maximum using Generics
 * @author Rosy Rupali
 * @since 11-06-2021
 * @version 1.0
 *************************************************/
package com.bridgelabz.generics;

public class MaximumOfThreeNumbers<T extends Comparable<T>> {
	
	T[] inputArray;

	
	public MaximumOfThreeNumbers(T[] inputArray) {
		this.inputArray = inputArray;          // Assigning values to an array
	}

	public T getMaximum() {
		return MaximumOfThreeNumbers.getMaximum(inputArray);
	}

	// Determines the maximum element present in the inputArray
	/**
	 * @param <T>
	 * @param inputArray taking multiple values in the form of array
	 * @return maximum value among the multiple values
	 */
	public static <T extends Comparable<T>> T getMaximum(T[] inputArray) {

		T max = inputArray[0];

		for (T element : inputArray) {			// store inputArray in element

			if (element.compareTo(max) > 0)   //comparing each element with other element to check largest element

				max = element; 
		}
		return max;  // returning maximum element
	}
}