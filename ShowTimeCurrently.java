package com.java.exercise.ejerciciosbasicos4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowTimeCurrently extends Thread {

	/*
	 * 39) Realiza un reloj digital que muestre la hora sin parar. Debe esperar un
	 * segundo real para darle mas realismo.
	 */

	public static void main(String[] args) {

		// lo metemos dentro de un while porque no queremos que acabe nunca
		while (true) {
			// creamos el formato de salida de la hora
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			// queremos crear una nueva fecha en sdf
			System.out.println(sdf.format(new Date()));
			try {
				// y que muestre la hora actual cada segundo
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
		}

	}

}