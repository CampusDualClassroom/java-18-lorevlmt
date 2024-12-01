package com.campusdual.classroom;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introducir el tamaño del array con un número entero:");

		int entero = scanner.nextInt();

		scanner.close();

		int[] array = createAndInitializeArray(entero);

		showInlineArray(array);
	}

	public static int[] createAndInitializeArray(int entero) {

		int[] array = new int[entero];
		for (int i = 0; i < entero; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);

			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
	}

}
