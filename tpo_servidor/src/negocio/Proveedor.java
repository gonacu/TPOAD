package negocio;

import java.util.ArrayList;

import dto.ItemListaPrecioDTO;
import dto.ProveedorDTO;

public class Proveedor {
	private String nombre;
	private String cuit;
	private ArrayList<ItemListaPrecio> listaPrecios;
	private int codigo;
	
	public Proveedor(ProveedorDTO proveedor) {
		this.nombre = proveedor.getNombre();
		this.cuit = proveedor.getCuit();
		this.codigo = proveedor.getCodigo();
		this.listaPrecios = new ArrayList<>();
		for (ItemListaPrecioDTO i : proveedor.getListaPrecios()){
			this.listaPrecios.add(new ItemListaPrecio(i));
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public ArrayList<ItemListaPrecio> getListaPrecios() {
		return listaPrecios;
	}
	public void setListaPrecios(ArrayList<ItemListaPrecio> listaPrecios) {
		this.listaPrecios = listaPrecios;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
}
