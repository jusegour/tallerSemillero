package com.clearminds.jgo.bdd.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.jgo.bdd.ConexionBDD;
import com.clearminds.jgo.excepciones.BDDException;

public class TestConexion {

	public static void main(String[] args) {

		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			if (conexion != null) {
				System.out.println("Conexion Exitosa");
			}
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
