package controladores;

import java.util.ArrayList;
import java.util.Date;

import negocio.AreaProduccion;
import negocio.ItemOPP;
import negocio.Lote;
import negocio.Opc;
import negocio.Opp;
import negocio.OrdenProduccion;
import negocio.PedidoCliente;
import negocio.Prenda;

public class AdministradorProduccion {
	private ArrayList<Prenda> prendas;
	private ArrayList<AreaProduccion> areasProduccion;
	private ArrayList<OrdenProduccion> ordenesProduccion;
	private ArrayList<Lote> lotes;
 
	//quito int cantidad d elos paremtros de los generarOrden porque ya esta en pedido creo
	public void generarOrdenProduccionParcial(Date fecha, int codigoPrenda, PedidoCliente pedido, ArrayList<ItemOPP> itemsOPP) {
		//ver de donde salen los itemsOPP
		Opp op = new Opp();
		op.setCodigo(codigoPrenda);
		op.setFecha(fecha);
		op.setPedidoCliente(pedido);
		op.setItems(itemsOPP);
		
	}
	
	//agrego y cambio  los generar para parcial y completo
	public void generarOrdenProduccionCompleta(Date fecha, int codigoPrenda, PedidoCliente pedido) {
		Opc oc = new Opc();
		oc.setCodigo(codigoPrenda);
		oc.setFecha(fecha);
		oc.setPedidoCliente(pedido);
	}
	private Prenda buscarPrenda(int codigo) {
		for (Prenda p:prendas){
			if (p.sosLaPrenda(codigo)){
				return p;
			}
		}
		return null;
	}

	private OrdenProduccion buscarOrden(int codigo) {
		for (OrdenProduccion o:ordenesProduccion){
			if (o.sosLaOrden(codigo)){
				return o;
			}
		}
		return null;
	}
}
