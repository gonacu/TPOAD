package dto;

public class BultoDTO {
	private int codigoBulto;
	private PrendaDTO prenda;
	private int cantidad;
	private LoteDTO lote;

	public int getCodigoBulto() {
		return codigoBulto;
	}

	public void setCodigoBulto(int codigoBulto) {
		this.codigoBulto = codigoBulto;
	}

	public PrendaDTO getPrenda() {
		return prenda;
	}

	public void setPrenda(PrendaDTO prenda) {
		this.prenda = prenda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LoteDTO getLote() {
		return lote;
	}

	public void setLote(LoteDTO lote) {
		this.lote = lote;
	}

}
