package negocio;

public abstract class MovimientoStock {
	protected int codigo;
	protected Ubicacion origen;
	protected String origenDetalle;
	protected Ubicacion destino;
	protected String destinoDetalle;
	protected String encargado;
	protected String autorizante;
	protected int cantidad;

	public boolean sosElMoviemiento(int codigo) {
		return this.codigo == codigo;

	}
}
