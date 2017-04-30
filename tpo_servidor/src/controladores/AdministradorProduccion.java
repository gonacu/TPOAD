package controladores;

import java.util.ArrayList;
import java.util.Date;

import negocio.AreaProduccion;
import negocio.OrdenProduccion;
import negocio.PedidoCliente;
import negocio.Prenda;

public class AdministradorProduccion {
	private ArrayList<Prenda> prendas;
	private ArrayList <AreaProduccion> areasProduccion;
	private ArrayList<OrdenProduccion> ordenesProduccion;
	private ArrayList<Lote> lotes;
	
	public void generarOrdenProduccion(Date fecha, int codigoPrenda, PedidoCliente pedido, int cantidad){
		
	}
	private Prenda buscarPrenda(int codigo){
		
	}
	private OrdenProduccion buscarOrden(int codigo){
		
	}
}
