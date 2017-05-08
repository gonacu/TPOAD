package controladores;

import java.util.ArrayList;

import dto.PedidoClienteDTO;
import negocio.PedidoCliente;

public class AdministradorPedidos {
	private ArrayList<PedidoCliente> pedidosPendientes;

	public void nuevoPedido(PedidoClienteDTO pedido) {
		pedidosPendientes.add(new PedidoCliente(pedido));
	}
	
	//deberia hacer algo mas??
}
