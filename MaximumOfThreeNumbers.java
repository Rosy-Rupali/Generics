/**************************************************
 * Purpose :  It is a program to find maximum number using Generics
 * @author Rosy Rupali
 * @since 11-06-2021
 * @version 1.0
 *************************************************/

package com.bridgelabz.generics;

public class MaximumOfThreeNumbers<T extends Comparable<T>> {
	// Taking more than three values in the form of an array
	T[] inputArray;

	public MaximumOfThreeNumbers(T[] inputArray) {
		this.inputArray = inputArray;
	}

	public T getMaximum() {
		return MaximumOfThreeNumbers.getMaximum(inputArray);
	}

	// Determines the maximum element present in the inputArray
	public static <T extends Comparable<T>> T getMaximum(T[] inputArray) {

		T max = inputArray[0];

		for (T element : inputArray) { // store inputArray in element

			if (element.compareTo(max) > 0) // comparing each element with other element to check largest element

				max = element;
		}
		printMaximum(inputArray, max);
		return max; // returning maximum element
	}

	public static <T> void printMaximum(T[] inputArray, T max) {
		for (T element : inputArray)
			System.out.print("  " + element);
		System.out.println("\nMaximum of the present element is: " + max);
	}

	public static void main(String args[]) {
		Integer[] intArray = { 4, 2, 1, 18, 34, 7, 9 };
		Float[] floatArray = { 6.5f, 2.9f, 2.6f, 4.6f };
		String[] stringArray = { "Apple", "Grapes", "Pineapple", "Orange", "Banana", "Lemon" };
		new MaximumOfThreeNumbers(intArray).getMaximum();
		new MaximumOfThreeNumbers(floatArray).getMaximum();
		new MaximumOfThreeNumbers(stringArray).getMaximum();
	}

}