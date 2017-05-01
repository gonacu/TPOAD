package negocio;

import java.util.Date;

import dto.FacturaDTO;

public class Factura {
	public Factura(FacturaDTO factDTO) {
		this.total = factDTO.getTotal();
		this.impuestos = factDTO.getImpuestos();
		this.fechaGeneracion = factDTO.getFechaGeneracion();
		this.cliente = new Cliente(factDTO.getCliente());
	}
	private float total;
	private float impuestos;
	private Date fechaGeneracion;
	private Cliente cliente;
	private PedidoCliente pedido;

}
