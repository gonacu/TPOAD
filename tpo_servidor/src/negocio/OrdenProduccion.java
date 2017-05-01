package negocio;

import java.util.Date;

public abstract class OrdenProduccion {
	private Date fecha;
	private Prenda prenda;
	private PedidoCliente pedidoCliente;
	private int codigo;

	public boolean sosLaOrden(int codigo) {
		return false; // cambiar

	}
}
