package entities;

import java.util.ArrayList;


public class AreaProduccionEntity {
	private String nombre;
	private ArrayList<LineaProduccionEntity> lineasProduccion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<LineaProduccionEntity> getLineasProduccion() {
		return lineasProduccion;
	}

	public void setLineasProduccion(ArrayList<LineaProduccionEntity> lineasProduccion) {
		this.lineasProduccion = lineasProduccion;
	}
}
