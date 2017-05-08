package entities;

import java.util.Date;

public class OrdenProduccionEntity {
	private Date fecha;
	private PrendaEntity prenda;
	private PedidoClienteEntity pedidoCliente;
	private int codigo;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public PrendaEntity getPrenda() {
		return prenda;
	}

	public void setPrenda(PrendaEntity prenda) {
		this.prenda = prenda;
	}

	public PedidoClienteEntity getPedidoCliente() {
		return pedidoCliente;
	}

	public void setPedidoCliente(PedidoClienteEntity pedidoCliente) {
		this.pedidoCliente = pedidoCliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
