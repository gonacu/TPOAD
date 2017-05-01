package negocio;

import java.util.Date;

import dto.LineaProduccionDTO;

public class LineaProduccion {
	
	private int capacidad;
	private String estado;
	private Date horaInicio;
	private Date tiempoDeUso;
	
	public LineaProduccion(LineaProduccionDTO lp) {
		this.capacidad = lp.getCapacidad();
		this.estado = lp.getEstado();
		this.horaInicio = lp.getHoraInicio();
		this.tiempoDeUso = lp.getTiempoDeUso();
	}
}
