package dto;

import java.util.ArrayList;

public class AreaProduccionDTO {
	private String nombre;
	private ArrayList<LineaProduccionDTO> lineasProduccion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<LineaProduccionDTO> getLineasProduccion() {
		return lineasProduccion;
	}
	public void setLineasProduccion(ArrayList<LineaProduccionDTO> lineasProduccion) {
		this.lineasProduccion = lineasProduccion;
	}
}
