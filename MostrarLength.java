package com.java.exercise.ejerciciosbasicos4;

import java.util.Scanner;

public class MostrarLength {

	public static void main(String[] args) {
		/*
		 * 31) Mostrar la longitud de una cadena.
		 */
		
		System.out.println("Escribe una frase para mostrar su longitud.");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		
		System.out.println("La longitud de " + frase + " es: " + frase.length());
	}

}
