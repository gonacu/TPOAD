package entities;

import java.util.ArrayList;

public class LoteEntity {
	private ArrayList<BultoEntity> bultos;
	private int codigo;
	private String color;
	private String talle;
	private int cantidaEntitytal;
	private OrdenProduccionEntity orden;

	public ArrayList<BultoEntity> getBultos() {
		return bultos;
	}

	public void setBultos(ArrayList<BultoEntity> bultos) {
		this.bultos = bultos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public int getCantidaEntitytal() {
		return cantidaEntitytal;
	}

	public void setCantidaEntitytal(int cantidaEntitytal) {
		this.cantidaEntitytal = cantidaEntitytal;
	}

	public OrdenProduccionEntity getOrden() {
		return orden;
	}

	public void setOrden(OrdenProduccionEntity orden) {
		this.orden = orden;
	}
}
