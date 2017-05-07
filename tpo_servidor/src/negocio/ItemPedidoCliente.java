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

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
