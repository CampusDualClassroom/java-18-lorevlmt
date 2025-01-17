package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {

		//int size = Utils.integer("Introducir el tamaño del array con un número entero:");

		//int[] array = createAndInitializeArray(size);

		//showInlineArray(array);

		//correción
		showInlineArray(createAndInitializeArray(Utils.integer("Introducir el tamaño del array con un número entero: ")));
	}

	public static int[] createAndInitializeArray(int size){
	//correción: números negativos
		if (size < 0) {
			return new int[0];

		} else {
			int[] array = new int[size];
			for (int i = 0; i < array.length; i++) {	//corregido i < size
				array[i] = i + 1;
			}
			return array;
		}

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
