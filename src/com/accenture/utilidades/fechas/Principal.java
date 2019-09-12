package com.accenture.utilidades.fechas;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		System.out.println( "El numero de dias es: " + Fecha.calcularDias(new Date(args[0]), new Date(args[1])));

	}

}
