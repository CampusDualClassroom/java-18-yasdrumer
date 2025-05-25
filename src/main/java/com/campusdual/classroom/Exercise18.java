package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int i = Utils.integer("Introduce numeros naturales: ");

		int[] myArray = new Exercise18().createAndInitializeArray(i);


		System.out.print("Array generado: ");
		showInlineArray(myArray);

	}

	public static int[] createAndInitializeArray(int n){
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
