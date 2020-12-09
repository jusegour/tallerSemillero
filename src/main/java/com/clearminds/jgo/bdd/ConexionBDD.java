package com.clearminds.jgo.bdd;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {

	public static String leerPropiedad(String nombrePropiedad) {
		String valorPropiedad = "";

		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));
			String propiedad = p.getProperty(nombrePropiedad);
			if (propiedad != null) {
				valorPropiedad = propiedad;
			} else {
				valorPropiedad = null;
			}

		} catch (IOException e) {
			e.printStackTrace();
			valorPropiedad = null;
		}

		return valorPropiedad;

	}

}
