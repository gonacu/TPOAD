package entities;

import java.util.Date;

public class LineaProduccionEntity {
	private int capacidad;
	private String estado;
	private Date horaInicio;
	private Date tiempoDeUso;

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getTiempoDeUso() {
		return tiempoDeUso;
	}

	public void setTiempoDeUso(Date tiempoDeUso) {
		this.tiempoDeUso = tiempoDeUso;
	}
}
