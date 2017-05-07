package negocio;

import java.util.ArrayList;
import java.util.Date;

import dto.ItemPedidoClienteDTO;
import dto.PedidoClienteDTO;

public class PedidoCliente {
	private int numPedidoCliente;
	private Cliente cliente;
	private String estado;
	private Date fechaGeneracion;
	private Date fechaProbableDespacho;
	private Date fechaDespacho;
	private ArrayList<ItemPedidoCliente> itemsPedidoCliente;
	private float precioTotal;
	
	public PedidoCliente(PedidoClienteDTO pedDTO) {
		this.numPedidoCliente = pedDTO.getNumPedidoCliente();
		this.cliente = new Cliente(pedDTO.getCliente());
		this.estado = pedDTO.getEstado();
		this.fechaGeneracion = pedDTO.getFechaGeneracion();
		this.fechaProbableDespacho = pedDTO.getFechaProbableDespacho();
		this.fechaDespacho = pedDTO.getFechaDespacho();
		for (ItemPedidoClienteDTO p : pedDTO.getItemsPedidoCliente()){
			this.itemsPedidoCliente.add(new ItemPedidoCliente(p));
		}
	}

	public void confirmarPedido(Date fechaProbableDespacho) {
		this.estado = "Confirmado"; //Supongo q son Confirmado / Por confirmar / Cancelado
	}

	public void cancelarPedido(String motivos) {
		this.estado = "Cancelado";		
	}

	public void aceptarPedidoPorCliente() {
		//falta
	}

	public void cancelarPedidoPorCliente() {
		//falta
	}

	public float calcularPrecio() {
		float precio = 0;
		for (ItemPedidoCliente i : itemsPedidoCliente){
			precio = precio + i.getPrecio(); 
		}
		//por ahi no va esta parte
		this.precioTotal = precio;		
		////////////////////
		return precio;
	}

	public int getNumPedidoCliente() {
		return numPedidoCliente;
	}

	public void setNumPedidoCliente(int numPedidoCliente) {
		this.numPedidoCliente = numPedidoCliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
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

	public ArrayList<ItemPedidoCliente> getItemsPedidoCliente() {
		return itemsPedidoCliente;
	}

	public void setItemsPedidoCliente(ArrayList<ItemPedidoCliente> itemsPedidoCliente) {
		this.itemsPedidoCliente = itemsPedidoCliente;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
}
