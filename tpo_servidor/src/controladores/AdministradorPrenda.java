package controladores;

import java.util.ArrayList;

import negocio.Prenda;

public class AdministradorPrenda {
	private ArrayList<Prenda> prendas;

	public void generarPrenda(ArrayList<String> talles, ArrayList<String> colores, String desc, float costoProduccion,
			float precio, float porcentaje) {
//revisar parametros, en Prenda estan talles disponibles, no "talles", por ahi querian decir lo mismo, pero por ahi no
	}

	private Prenda buscarPrenda(int numero) {
		for (Prenda p:prendas){
			if (p.sosLaPrenda(numero)){
				return p;
			}
		}
		return null;
	}

	public void bajaPrenda(int numero) {
		
	}
}
