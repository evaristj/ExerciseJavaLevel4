package com.java.exercise.ejerciciosbasicos4;

import java.util.Scanner;

public class MonthOfYear {

	public static void main(String[] args) {

		/*
		 * 37) Crea el enum Mes, que contenga como parametros el orden(1,2,3,etc) y el
		 * numero de dias (febrero tendra 28 dias siempre). Estos datos pueden pedirse
		 * por separado, asi que tienes que hacer sus respectivos get. No son necesarios
		 * los setters. Create un arrays de Mes (mirate la funcion values del enum),
		 * pide un numero por teclado e indica que meses tienen ese numero de dias (toda
		 * su informacion). Por ejemplo, si escribes un 28, este te devolvera la
		 * informacion de FEBRERO.
		 */

		// creamos un array de los valores de los enums de la clase mes
		Mes[] meses = Mes.values();
		System.out.println("Introduce el nº de mes o los días que tiene un mes:");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		// reccorremos su longitud
		for (int i = 0; i < meses.length; i++) {

			// segun el numero introducido, los dias de un mes o la posicion del mes,
			// imprimimos toda la informacion
			if (meses[i].getOrden() == number) {

				System.out.println(meses[i].toString());

			} else if (meses[i].getNumDias() == number) {

				System.out.println(meses[i].toString());

			}
		}
	}
}
