package negocio;

import dto.EmpleadoDTO;

public class Empleado {
	
	private String nombre;
	private String tipo;
	
	public Empleado(EmpleadoDTO eDTO) {
		this.nombre = eDTO.getNombre();
		this.tipo = eDTO.getTipo();
	}
}
