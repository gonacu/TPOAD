package negocio;

import java.util.Calendar;
import java.util.Date;

import dto.FacturaDTO;

public class Factura {
	private float total;
	private float impuestos;
	private Date fechaGeneracion;
	private Cliente cliente;
	private PedidoCliente pedido;
	private int numeroFact;

	public Factura(FacturaDTO factDTO) {
		this.total = factDTO.getTotal();
		this.impuestos = factDTO.getImpuestos();
		this.fechaGeneracion = factDTO.getFechaGeneracion();
		this.cliente = new Cliente(factDTO.getCliente());
		this.numeroFact = factDTO.getNumeroFact();
	}

	public Factura (PedidoCliente pedido){
		//this.pedido = pedido;  Para que guardo en factura el cliente si ya esta en pedidoCliente
		this.cliente = pedido.getCliente();
		
		Calendar cal = Calendar.getInstance();
		this.fechaGeneracion = cal.getTime();
		//falta el resto
	}
	

	
	public boolean sosLaFactura(int numero){
		return this.numeroFact == numero;
	}
	


	

}
