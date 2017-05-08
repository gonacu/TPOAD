package entities;

public class ItemListaPrecioEntity {
	private InsumoEntity insumo;
	private float precio;

	public InsumoEntity getInsumo() {
		return insumo;
	}

	public void setInsumo(InsumoEntity insumo) {
		this.insumo = insumo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
