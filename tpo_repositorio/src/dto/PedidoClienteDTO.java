package dto;

import java.util.ArrayList;
import java.util.Date;

public class PedidoClienteDTO {
	private int numPedidoCliente;
	private ClienteDTO cliente;
	private String estado;
	private Date fechaGeneracion;
	private Date fechaProbableDespacho;
	private Date fechaDespacho;
	private ArrayList<ItemPedidoClienteDTO> itemsPedidoCliente;
	private float precioTotal;
	public int getNumPedidoCliente() {
		return numPedidoCliente;
	}
	public void setNumPedidoCliente(int numPedidoCliente) {
		this.numPedidoCliente = numPedidoCliente;
	}
	public ClienteDTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDTO cliente) {
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
	public ArrayList<ItemPedidoClienteDTO> getItemsPedidoCliente() {
		return itemsPedidoCliente;
	}
	public void setItemsPedidoCliente(ArrayList<ItemPedidoClienteDTO> itemsPedidoCliente) {
		this.itemsPedidoCliente = itemsPedidoCliente;
	}
	public float getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}
