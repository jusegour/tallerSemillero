package com.clearminds.jgo.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.jgo.bdd.ConexionBDD;
import com.clearminds.jgo.excepciones.BDDException;

public class ServicioBase {

	private Connection conexion;

	public void abrirConexion() throws BDDException {
		try {
			this.conexion = ConexionBDD.obtenerConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void cerrarConexion() {
		if (this.conexion != null) {
			try {
				this.conexion.close();
				System.out.println("Conexion Cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
				System.err.println("Error al cerrar la conexion");
			}
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	

}
