package com.clearminds.jgo.servicios;

import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.jgo.dtos.Estudiante;
import com.clearminds.jgo.excepciones.BDDException;
import com.clearminds.jgo.utils.DateUtil;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando estudiante: " + estudiante);
		Statement stmt = null;

		try {
			stmt = getConexion().createStatement();

			String sql = "insert into estudiantes(nombre,apellido,edad,fecha_modificacion) values('"
					+ estudiante.getNombre() + "','" + estudiante.getApellido() + "','" + estudiante.getEdad() + "','"
					+ DateUtil.obtenerFecha() +"')";

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Actualizando estudiante: " + estudiante);
		Statement stmt = null;

		try {
			stmt = getConexion().createStatement();

			String sql = "update estudiantes set nombre='" + estudiante.getNombre() + "',apellido='"
					+ estudiante.getApellido() + "',edad='" + estudiante.getEdad() + "',fecha_modificacion='"
					+ DateUtil.obtenerFecha() + "' where id='" + estudiante.getId() + "'";

			System.out.println("Script: " + sql);
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}
	}
}
