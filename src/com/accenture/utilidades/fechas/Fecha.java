package com.accenture.utilidades.fechas;

import java.time.DateTimeException;
import java.util.Date;

public class Fecha
{
	public static int compararFechas(Date fechaUno, Date fechaDos)
	{
		int retorno = fechaUno.compareTo(fechaDos);
		return retorno;
	}
	
	public static int calcularDias(Date fechaInicio, Date fechaFin) {
		
		try {
			
			if( fechaInicio == null || fechaFin == null ) {
				throw new DateTimeException("Las fechas no pueden ser null");
			}
			
			long diferencia = fechaFin.getTime() - fechaInicio.getTime();
			Long d = (diferencia / (1000*60*60*24));
			int dias = d.intValue();
						
			return dias;
		}
		catch(DateTimeException e) {
			System.err.println("He capturado el error: " + e);
			throw e;
		}
		catch(Exception e) {
			throw e;
		}
		finally {
			System.out.println("Finally: Me he ejecutado!! :)");
		}
	}
}
