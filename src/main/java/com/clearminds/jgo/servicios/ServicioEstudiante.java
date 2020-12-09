package com.clearminds.jgo.servicios;

import com.clearminds.jgo.dtos.Estudiante;
import com.clearminds.jgo.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.print("Insertando estudiante: ");
		System.out.println(estudiante);
		cerrarConexion();
	}
}
