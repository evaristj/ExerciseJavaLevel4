package com.java.exercise.ejerciciosbasicos4;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		/*
		 * 33) Dada una cadena, extraer la cuarta y quinta letra usando el método
		 * substring.
		 */

		System.out.println("Escribe una frase de 5 o más letras.");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		if (frase.length() >= 4) {
			// metodo substring extrae de un string lo que este entre el primer parametro y
			// el segundo
			String caracteres = frase.substring(3, 5);

			System.out.println("Estos son los caracteres 4 y 5 de la cadena escrita: " + caracteres);
		} else {
			System.out.println("La frase no tiene los caracteres necesarios.");
		}

	}

}
