package negocio;

import java.util.ArrayList;




public class PedidoCliente {
	private int numPedidoCliente;
	private Cliente cliente;
	private String estado;
	private Date fechaGeneracion;
	private Date fechaProbableDespacho;
	private Date fechaDespacho;
	private ArrayList<ItemPedidoCliente> itemsPedidoCliente;
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
