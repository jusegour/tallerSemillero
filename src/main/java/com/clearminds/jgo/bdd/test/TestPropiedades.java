package com.clearminds.jgo.bdd.test;

import com.clearminds.jgo.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {

		String valor = ConexionBDD.leerPropiedad("propiedad1");
		System.out.println(valor);
		valor = ConexionBDD.leerPropiedad("xx");
		System.out.println(valor);
	}

}
