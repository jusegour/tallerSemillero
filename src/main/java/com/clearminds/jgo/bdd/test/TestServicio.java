package com.clearminds.jgo.bdd.test;

import com.clearminds.jgo.dtos.Estudiante;
import com.clearminds.jgo.excepciones.BDDException;
import com.clearminds.jgo.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {

		ServicioEstudiante srvEstudiante=new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Juan","Perez"));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
