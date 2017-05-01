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

	}

	public void cancelarPedido(String motivos) {

	}

	public void aceptarPedidoPorCliente() {

	}

	public void cancelarPedidoPorCliente() {

	}

	public float calcularPrecio() {
		return 0;

	}
}
