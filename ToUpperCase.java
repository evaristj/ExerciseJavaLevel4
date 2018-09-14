package com.java.exercise.ejerciciosbasicos4;

import java.util.Scanner;

public class ToUpperCase {

	public static void main(String[] args) {

		/*
		 * 30) Convertir una frase a mayúsculas o minúsculas, que daremos opción
		 * a que el usuario lo pida y mostraremos el resultado por pantalla.
		 */
		
		System.out.println("Escribe una frase:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		System.out.println("Elige mayus para transformar la frase a mayusculas.");
		System.out.println("Elige minus para transformar la frase a minusculas.");
		String transform = sc.nextLine();
		
		switch (transform) {
		case "mayus":
			System.out.println(frase.toUpperCase());
			break;
		case "minus":
			System.out.println(frase.toLowerCase());
			break;
		default:
			System.out.println("No has introducido la instrucción correctamente.");
			break;
		}
	}

}
