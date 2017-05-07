package negocio;

import java.util.Date;

import dto.LoteInsumoDTO;

public class LoteInsumo {
	private Date fechaRecepcion;
	private Proveedor proveedor;
	private float cantidad;
	private Insumo insumo;
	private int codigoLoteInsumo;

	public LoteInsumo(LoteInsumoDTO liDTO) {
		this.fechaRecepcion = liDTO.getFechaRecepcion();
		this.proveedor = new Proveedor(liDTO.getProveedor());
		this.cantidad = liDTO.getCantidad();
		this.insumo = new Insumo (liDTO.getInsumo());
		this.codigoLoteInsumo = liDTO.getCodigoLoteInsumo();
	}

	public boolean sosElLote(int codigo) {
		return codigo == this.codigoLoteInsumo;// ---

	}

	public boolean tenesElLote(int codigo) {
		return false;// falta hacer, no se que pide
	}

}
