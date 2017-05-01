package negocio;

import dto.InsumoDTO;

public class Insumo {
	private int codigo;
	private String nombre;
	private float stockActual;
	private float precioFinal;
	private float stockMinimo;
	private String unidad;
	private float cantAComprar;

	public Insumo(InsumoDTO insumo) {
		this.codigo = insumo.getCodigo();
		this.nombre = insumo.getNombre();
		this.stockActual = insumo.getStockActual();
		this.precioFinal = insumo.getPrecioFinal();
		this.stockMinimo = insumo.getStockMinimo();
		this.unidad = insumo.getUnidad();
		this.cantAComprar = insumo.getCantAComprar();
	}

	public boolean sosElInsumo(int codigo) {
		return false;// ---

	}
}
