package com.java.exercise.ejerciciosbasicos4;

import java.util.Scanner;

public class DayOfWeekSwitch {

	public static void main(String[] args) {

		/*
		 * 35) Crea un enum con los días de la semana, pide un día de la semana e indica
		 * si es laboral o no (comparando el dato introducido con valueOf del enum).
		 */

		System.out.println("Introduce un día de la semana:");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String diaSemana = sc.nextLine();

		switch (diaSemana.toLowerCase()) {
		case "lunes":
			System.out.println(DayOfWeek.LUNES.toString());
			break;
		case "martes":
			System.out.println(DayOfWeek.MARTES.toString());
			break;
		case "miercoles":
			System.out.println(DayOfWeek.MIERCOLES.toString());
			break;
		case "jueves":
			System.out.println(DayOfWeek.JUEVES.toString());
			break;
		case "viernes":
			System.out.println(DayOfWeek.VIERNES.toString());
			break;
		case "sabado":
			System.out.println(DayOfWeek.SABADO.toString());
			break;
		case "domingo":
			System.out.println(DayOfWeek.DOMINGO.toString());
			break;
		default:
			System.out.println("No has introducido un valor correcto.");
			break;
		}
	}

}
