package negocio;

import java.util.ArrayList;
import java.util.Date;

import dto.ItemPedidoClienteDTO;




public class PedidoCliente {
	private int numPedidoCliente;
	private Cliente cliente;
	private String estado;
	private Date fechaGeneracion;
	private Date fechaProbableDespacho;
	private Date fechaDespacho;
	private ArrayList<ItemPedidoClienteDTO> itemsPedidoCliente;
	private float precioTotal;
	public void confirmarPedido(Date fechaProbableDespacho) {
	
	}
	
	public void cancelarPedido(String motivos) {
	
	}
	
	public void aceptarPedidoPorCliente() {
	
	}
	
	public void cancelarPedidoPorCliente() {
	
	}
	
	public float calcularPrecio() {
	
	}
}
