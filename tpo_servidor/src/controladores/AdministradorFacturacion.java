package controladores;

import java.util.ArrayList;

import negocio.Cliente;
import negocio.Factura;
import negocio.PedidoCliente;

public class AdministradorFacturacion {
	private ArrayList<Factura> facturas;
	private ArrayList<Cliente> clientes;

	public void generarFactura(PedidoCliente pedido) {
		facturas.add(new Factura(pedido)); //revisar
	}

	public void registrarPago(float cantidad, int numeroCliente) {
  //falta
	}

	private Factura buscarFactura(int numero) {
		for (Factura f : facturas){
			if (f.sosLaFactura (numero)){
				return f;
			}
		}
		return null;
	}

	private Cliente buscarCliente(int numero) {
		for (Cliente c  : clientes){
			if (c.sosElCliente (numero)){
				return c;
			}
		}
		return null;
	}

}
