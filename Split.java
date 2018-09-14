package com.java.exercise.ejerciciosbasicos4;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {

		/*
		 * 34) Dada una frase, separarlo en palabras.
		 */

		System.out.println("Vamos a separar una frase en palabras.");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();

		// metodo split de la clase String, separa el String con la condicion que le
		// pasemos por parametro
		String palabras[] = frase.split(" ");

		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}

}
