package entities;

public class MovimientoStockEntity {
	protected int codigo;
	protected UbicacionEntity origen;
	protected String origenDetalle;
	protected UbicacionEntity destino;
	protected String destinoDetalle;
	protected String encargado;
	protected String autorizante;
	protected int cantidad;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public UbicacionEntity getOrigen() {
		return origen;
	}

	public void setOrigen(UbicacionEntity origen) {
		this.origen = origen;
	}

	public String getOrigenDetalle() {
		return origenDetalle;
	}

	public void setOrigenDetalle(String origenDetalle) {
		this.origenDetalle = origenDetalle;
	}

	public UbicacionEntity getDestino() {
		return destino;
	}

	public void setDestino(UbicacionEntity destino) {
		this.destino = destino;
	}

	public String getDestinoDetalle() {
		return destinoDetalle;
	}

	public void setDestinoDetalle(String destinoDetalle) {
		this.destinoDetalle = destinoDetalle;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public String getAutorizante() {
		return autorizante;
	}

	public void setAutorizante(String autorizante) {
		this.autorizante = autorizante;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
