package com.java.exercise.ejerciciosbasicos4;

import java.util.Scanner;

public class ContadorNumeros {

	public static void main(String[] args) {

		/*
		 * 38) Pedir números al usuario y cuando el usuario meta un -1 se terminará el
		 * programa. Al terminar, mostrará lo siguiente: – mayor numero introducido –
		 * menor numero introducido – suma de todos los numeros – suma de los numeros
		 * positivos – suma de los numeros negativos – media de la suma El número -1 no
		 * contara como número.
		 */

		System.out
				.println("Introduce números. Para terminar introduce -1. A continuación calcularemos todos los introducidos.");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double principal = 0;
		double numMenor = 0;
		double numMayor = 0;
		double suma = 0;
		double mediaSuma;
		// no queremos que el contador cuente cuando introducimos -1, por lo que
		// empezamos a contar en -1
		double contador = -1;
		double sumaPositivos = 0;
		// no queremos que sumaNegativos cuente cuando introducimos -1, por lo que
		// empezamos a contar en 1
		double sumaNegativos = 1;

		do {
			System.out.println("Introduce un numero:");
			principal = sc.nextInt();

			// si el num introducido es mayor a numMayor, igualamos la variable numMayor a
			// principal
			if (numMayor < principal) {
				numMayor = principal;
			}

			// no queremos que en la suma total cuente el valor -1, lo ponemos con la
			// siguiente condicion
			if (principal != -1) {
				suma += principal;
			}

			if (principal >= 0) {
				sumaPositivos += principal;
			} else {
				sumaNegativos += principal;
			}

			// no queremos que cuente el valor -1 como un numero negativo introducido
			if (numMenor > principal && principal != -1) {
				numMenor = principal;
			}

			contador++;

			// cuando insertemos -1 nuestro programa finalizará
		} while (principal != -1);

		mediaSuma = suma / contador;

		System.out.println("Has introducido: " + contador + " numeros.");
		System.out.println("El menor es: " + numMenor);
		System.out.println("El mayor es: " + numMayor);
		System.out.println("La suma de negativos y positivos es: " + suma);
		System.out.println("La suma de los positivos es: " + sumaPositivos);
		System.out.println("La suma de los negativos es: " + sumaNegativos);
		System.out.println("La media es: " + mediaSuma);
	}

}
