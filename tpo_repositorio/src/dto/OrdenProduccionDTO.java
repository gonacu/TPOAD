package dto;

import java.util.Date;

public class OrdenProduccionDTO {
	private Date fecha;
	private PrendaDTO prenda;
	private PedidoClienteDTO pedidoCliente;
	private int codigo;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public PrendaDTO getPrenda() {
		return prenda;
	}

	public void setPrenda(PrendaDTO prenda) {
		this.prenda = prenda;
	}

	public PedidoClienteDTO getPedidoCliente() {
		return pedidoCliente;
	}

	public void setPedidoCliente(PedidoClienteDTO pedidoCliente) {
		this.pedidoCliente = pedidoCliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
