package negocio;

import java.util.ArrayList;

import dto.AreaProduccionDTO;
import dto.LineaProduccionDTO;

public class AreaProduccion {
	
	private String nombre;
	private ArrayList<LineaProduccion> lineasProduccion;
	
	public AreaProduccion(AreaProduccionDTO area) {
		this.nombre = area.getNombre();
		for (LineaProduccionDTO lp : area.getLineasProduccion()){
			this.lineasProduccion.add(new LineaProduccion(lp));
		}
	}
}
