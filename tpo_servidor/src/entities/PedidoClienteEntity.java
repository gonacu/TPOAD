package entities;

import java.util.ArrayList;
import java.util.Date;

public class PedidoClienteEntity {
	private int numPedidoCliente;
	private ClienteEntity cliente;
	private String estado;
	private Date fechaGeneracion;
	private Date fechaProbableDespacho;
	private Date fechaDespacho;
	private ArrayList<ItemPedidoClienteEntity> itemsPedidoCliente;
	private float precioTotal;

	public int getNumPedidoCliente() {
		return numPedidoCliente;
	}

	public void setNumPedidoCliente(int numPedidoCliente) {
		this.numPedidoCliente = numPedidoCliente;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public Date getFechaProbableDespacho() {
		return fechaProbableDespacho;
	}

	public void setFechaProbableDespacho(Date fechaProbableDespacho) {
		this.fechaProbableDespacho = fechaProbableDespacho;
	}

	public Date getFechaDespacho() {
		return fechaDespacho;
	}

	public void setFechaDespacho(Date fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}

	public ArrayList<ItemPedidoClienteEntity> getItemsPedidoCliente() {
		return itemsPedidoCliente;
	}

	public void setItemsPedidoCliente(ArrayList<ItemPedidoClienteEntity> itemsPedidoCliente) {
		this.itemsPedidoCliente = itemsPedidoCliente;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

}
