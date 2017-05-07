package negocio;

import java.util.ArrayList;

import dto.OrdenProduccionDTO;

public class Opp extends OrdenProduccion {
	private ArrayList<ItemOPP> items;

	public Opp (OrdenProduccionDTO opDTO){
		this.fecha = opDTO.getFecha();
		this.codigo = opDTO.getCodigo();
		this.pedidoCliente = new PedidoCliente (opDTO.getPedidoCliente());
		this.prenda = new Prenda (opDTO.getPrenda());
		//this.items = ????    de donde saldrian los items?
		this.items = new ArrayList<>();
	}
	
	public Opp(){
		
	}

	public ArrayList<ItemOPP> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemOPP> items) {
		this.items = items;
	}
	
}

