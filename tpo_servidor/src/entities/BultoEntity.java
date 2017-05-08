package entities;

public class BultoEntity {
	private int codigoBulto;
	private PrendaEntity prenda;
	private int cantidad;
	private LoteEntity lote;

	public int getCodigoBulto() {
		return codigoBulto;
	}

	public void setCodigoBulto(int codigoBulto) {
		this.codigoBulto = codigoBulto;
	}

	public PrendaEntity getPrenda() {
		return prenda;
	}

	public void setPrenda(PrendaEntity prenda) {
		this.prenda = prenda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LoteEntity getLote() {
		return lote;
	}

	public void setLote(LoteEntity lote) {
		this.lote = lote;
	}

}
