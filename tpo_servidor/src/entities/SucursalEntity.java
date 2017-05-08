package entities;

import java.util.ArrayList;

public class SucursalEntity {
	private int numero;
	private String nombre;
	private String ubicacion;
	private String horarios;
	private ArrayList<EmpleadoEntity> empleados;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public ArrayList<EmpleadoEntity> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<EmpleadoEntity> empleados) {
		this.empleados = empleados;
	}

}
