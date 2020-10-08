package com.blz.printarray;

public class PrintArray {
	private static <T> void toPrint(T[] array) {
		for (T element : array)
			System.out.println(element);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Generics");
		Integer[] intArray = { 1, 2, 3 };
		Double[] doubleArray = { 1.0, 2.0, 3.0 };
		Character[] charArray = { 'a', 'b', 'c' };
		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);
	}
}
