package negocio;

import java.util.ArrayList;
import java.util.Date;

public class PedidoInsumo {
	private Proveedor proveedor;
	private Date fechaGeneracion;
	private Date fechaProbableDespacho;
	private Date fechaDespacho;
	private ArrayList<ItemPedidoInsumo> itemsPedidoInsumo;
	private OrdenProduccion ordenProduccion;
	private int codigo;

	public boolean sosElPedido(int codigo) {
		return this.codigo == codigo;
	}
}
