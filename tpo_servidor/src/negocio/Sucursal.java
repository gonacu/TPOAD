package negocio;

import java.util.ArrayList;

import dto.EmpleadoDTO;
import dto.SucursalDTO;

public class Sucursal {
	private int numero;
	private String nombre;
	private String ubicacion;
	private String horarios;
	private ArrayList<Empleado> empleados;

	public Sucursal(SucursalDTO sucursal) {
		this.numero = sucursal.getNumero();
		this.ubicacion = sucursal.getUbicacion();
		this.nombre = sucursal.getNombre();
		this.horarios = sucursal.getHorarios();
		for (EmpleadoDTO eDTO : sucursal.getEmpleados()){
			this.empleados.add(new Empleado(eDTO));
		}
	}

	public boolean sosLaSucursal(int codigo) {
		return false;// ---

	}

}
