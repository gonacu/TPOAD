package negocio;

import dto.OrdenProduccionDTO;

public class Opc extends OrdenProduccion {
	
	public Opc (OrdenProduccionDTO opDTO){
		this.fecha = opDTO.getFecha();
		this.codigo = opDTO.getCodigo();
		this.pedidoCliente = new PedidoCliente (opDTO.getPedidoCliente());
		this.prenda = new Prenda (opDTO.getPrenda());	
	}

	public Opc() {

	}	
	
}
