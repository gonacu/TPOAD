package entities;

import java.util.Date;

public class FacturaEntity {
	private float total;
	private float impuestos;
	private Date fechaGeneracion;
	private ClienteEntity cliente;
	private PedidoClienteEntity pedido;
	private int numeroFact;

	public int getNumeroFact() {
		return numeroFact;
	}

	public void setNumeroFact(int numeroFact) {
		this.numeroFact = numeroFact;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(float impuestos) {
		this.impuestos = impuestos;
	}

	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public PedidoClienteEntity getPedido() {
		return pedido;
	}

	public void setPedido(PedidoClienteEntity pedido) {
		this.pedido = pedido;
	}
}
