package com.java.exercise.ejerciciosbasicos4;

public enum DayOfWeek {

	LUNES("laboral", 1),

	MARTES("laboral", 2),

	MIERCOLES("laboral", 3),

	JUEVES("laboral", 4),

	VIERNES("laboral", 5),

	SABADO("festivo", 6),

	DOMINGO("festivo", 7);

	private String valor;
	private int numDia;

	private DayOfWeek(String valor, int numDia) {
		this.valor = valor;
		this.numDia = numDia;
	}

	public int getNumDia() {
		return numDia;
	}

	public String getValor() {
		return valor;
	}

	@Override
	public String toString() {

		return "El dia " + this.name().toLowerCase() + " es " + this.valor + " y está en la posición " + this.numDia + ".";

	}
}
