package negocio;

import dto.ItemPedidoClienteDTO;

public class ItemPedidoCliente {

	private Prenda prenda;
	private String color;
	private String talle;
	private int cantidad;
	private float precio;
	
	public ItemPedidoCliente(ItemPedidoClienteDTO p) {
		this.prenda = new Prenda(p.getPrenda());
		this.color = p.getColor();
		this.talle = p.getTalle();
		this.cantidad = p.getCantidad();
		this.precio = p.getPrecio();
	}
	
}
