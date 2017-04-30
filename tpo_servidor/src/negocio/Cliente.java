package negocio;

import java.util.ArrayList;




public class Cliente {
	private int numeroCliente;
	private Factura factura;
	private String direccion;
	private String cuit;
	private CuentaCorriente cuentaCorriente;
	private String nombre;
	private String categoria;
	private String informacionAdicional;
	private Sucursal sucursal;
	private ArrayList<PedidoCliente> pedidosCliente;
	public void agregarPedido(PedidoCliente pedidoCliente) {
	
	}
	
	public boolean sosElCliente(int numero) {
		return false;//----
	
	}
	
	public void modificarLimiteCredito(float limite) {
	
	}
}
