package com.wbg.examen.app;

import com.wbg.examen.app.animal.Caballo;
import com.wbg.examen.app.articulos.Tablero;

public class Miappjava2 {

	public static void main(String[] args) {

		Tablero tablero = new Tablero();
		tablero.setCantidad(20);
		tablero.setMaterial("metal");
		tablero.setPeso(11.50);

		System.out.println("tablero: material = " + tablero.getMaterial() + ", cantidad = " + tablero.getCantidad()
				+ ", peso = " + tablero.getPeso());

		Caballo caballo = new Caballo();
		caballo.setEdad(2);
		caballo.setPeso(10.20);
		caballo.setRaza("niche");

		System.out.println("caballo: edad = " + caballo.getEdad() + ", peso = " + caballo.getPeso() + ", raza = "
				+ caballo.getRaza());

	}

}
