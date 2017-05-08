package entities;

import java.util.Date;

public class LoteInsumoEntity {
	private Date fechaRecepcion;
	private ProveedorEntity proveedor;
	private float cantidad;
	private InsumoEntity insumo;
	private int codigoLoteInsumo;

	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	public ProveedorEntity getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorEntity proveedor) {
		this.proveedor = proveedor;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public InsumoEntity getInsumo() {
		return insumo;
	}

	public void setInsumo(InsumoEntity insumo) {
		this.insumo = insumo;
	}

	public int getCodigoLoteInsumo() {
		return codigoLoteInsumo;
	}

	public void setCodigoLoteInsumo(int codigoLoteInsumo) {
		this.codigoLoteInsumo = codigoLoteInsumo;
	}
}
