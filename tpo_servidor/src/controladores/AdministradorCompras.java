package controladores;

import java.util.ArrayList;

import dto.InsumoDTO;
import negocio.PedidoInsumo;
import negocio.Proveedor;

public class AdministradorCompras {
	private ArrayList<Proveedor> proveedores;
	private ArrayList<PedidoInsumo> pedidosInsumos;

	public void generarOrdenCompra(InsumoDTO insDTO) { //esto ya no me acuerdo si es con InsumoDTO o LoteInsumoDTO, asumo q es insumodto
		
	}

	public void generarPedido(ArrayList<String> datosPedido) {

	}

	private PedidoInsumo buscarPedidoInsumo(int codigo) {
		return null;//---

	}
}
