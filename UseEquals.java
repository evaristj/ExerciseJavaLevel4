package com.java.exercise.ejerciciosbasicos4;

import java.util.Scanner;

public class UseEquals {

	public static void main(String[] args) {

		/*
		 * 32) Pedir dos palabras por teclado, indicar si son iguales.
		 */

		System.out.println("Escribe una palabra.");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String palabra1 = sc.nextLine();
		
		System.out.println("Escribe otra palabra y comprobaremos si son iguales.");
		String palabra2 = sc.nextLine();

		// utilizamos equals para Strings y == entre operadores
		if (palabra1.equals(palabra2) || palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("La palabra: " + palabra1 + " es igual a: " + palabra2 + " .");
		} else {
			System.out.println("Las palabras escritas no son iguales.");
		}
	}

}
