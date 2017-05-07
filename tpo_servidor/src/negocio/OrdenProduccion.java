package negocio;

import java.util.Date;

public abstract class OrdenProduccion {
	protected Date fecha;  //cambie de private a protected
	protected Prenda prenda;
	protected PedidoCliente pedidoCliente;
	protected int codigo;

	public boolean sosLaOrden(int codigo) {
		return (codigo == this.codigo);

	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public PedidoCliente getPedidoCliente() {
		return pedidoCliente;
	}

	public void setPedidoCliente(PedidoCliente pedidoCliente) {
		this.pedidoCliente = pedidoCliente;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
