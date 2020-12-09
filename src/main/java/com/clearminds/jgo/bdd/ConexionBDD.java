package com.clearminds.jgo.bdd;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.jgo.excepciones.BDDException;

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

	public static Connection obtenerConexion() throws BDDException, SQLException {
		Connection conexion = null;
		String usuario = "";
		String password = "";
		String urlConexion = "";

		usuario = leerPropiedad("usuario");
		password = leerPropiedad("password");
		urlConexion = leerPropiedad("urlConexion");
		
		
		conexion = DriverManager.getConnection(urlConexion+"user="+usuario+";password="+password+";");

		if (conexion == null) {
			throw new BDDException("No se pudo conectar a la base de datos.");
		}

		return conexion;

	}

}
