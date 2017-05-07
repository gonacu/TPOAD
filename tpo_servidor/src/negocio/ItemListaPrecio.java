package negocio;

import dto.ItemListaPrecioDTO;

public class ItemListaPrecio {
	private Insumo insumo;
	private float precio;
	
	public ItemListaPrecio (ItemListaPrecioDTO ilDTO){
		this.insumo = new Insumo(ilDTO.getInsumo());
		this.precio = ilDTO.getPrecio();
	}
	
	public Insumo getInsumo() {
		return insumo;
	}
	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
