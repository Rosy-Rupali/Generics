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

		for (T element : inputArray) {			// store inputArray in element

			if (element.compareTo(max) > 0)   //comparing each element with other element to check largest element

				max = element; 
		}
		return max;  // returning maximum element
	}
}