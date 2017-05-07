package dto;

import java.util.Date;

public class FacturaDTO {
	private float total;
	private float impuestos;
	private Date fechaGeneracion;
	private ClienteDTO cliente;
	private PedidoClienteDTO pedido;
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

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public PedidoClienteDTO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoClienteDTO pedido) {
		this.pedido = pedido;
	}
}
