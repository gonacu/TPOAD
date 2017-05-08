package controladores;

import java.util.ArrayList;

import negocio.PedidoCliente;
import negocio.Transporte;

public class Despacho {
	private ArrayList<Transporte> transportes;
	private ArrayList<PedidoCliente> pedidos;

	public void registrarFecha() {

	}

	public void confeccionarEnvio(PedidoCliente pedido) {

	}

	private Transporte buscarTransporte(int codigo) {
		for (Transporte t: transportes){
			if (t.sosElTranporte(codigo))
				return t;
		}
		return null;
	}
}
