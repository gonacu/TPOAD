package negocio;

import java.util.ArrayList;

import dto.ItemPrendaAreaDTO;
import dto.ItemPrendaInsumoDTO;
import dto.PrendaDTO;

public class Prenda {
	private int codigo;
	private String descripcion;
	private ArrayList<String> coloresPosibles;
	private ArrayList<String> tallesPosibles;
	private OrdenProduccion ordenProduccion;
	private boolean estadoProduccion;
	private float costoProduccionReal;
	private float costoProduccionActual;
	private float porcentajeGanancia;
	private float precio;
	private ArrayList<ItemPrendaInsumo> itemsPrendaInsumo;
	private ArrayList<ItemPrendaArea> itemsPrendaArea;
	public int cantidadAConfeccionar;

	public Prenda(PrendaDTO preDTO) {
		this.codigo = preDTO.getCodigo();
		this.descripcion = preDTO.getDescripcion();
		this.coloresPosibles = preDTO.getColoresPosibles();
		this.tallesPosibles = preDTO.getTallesPosibles();
		//Verificar si la orden es parcial, no estoy seguro si en ordenProduccion guardo una Opp u Opc directamente
		/*
		if (preDTO.getOrdenProduccion().esParcial())
			this.ordenProduccion = new Opp (preDTO.getOrdenProduccion());
		else
			this.ordenProduccion = new Opc(preDTO.getOrdenProduccion());		
		*/
		this.estadoProduccion = preDTO.getEstadoProduccion();
		this.costoProduccionReal = preDTO.getCostoProduccionReal();
		this.costoProduccionActual = preDTO.getCostoProduccionActual();
		this.porcentajeGanancia = preDTO.getPorcentajeGanancia();
		this.precio = preDTO.getPrecio();
		for (ItemPrendaInsumoDTO ipiDTO : preDTO.getItemsPrendaInsumo()){
			this.itemsPrendaInsumo.add(new ItemPrendaInsumo(ipiDTO));	
		}
		for (ItemPrendaAreaDTO ipaDTO : preDTO.getItemsPrendaArea()){
			this.itemsPrendaArea.add(new ItemPrendaArea(ipaDTO));	
		}
		this.cantidadAConfeccionar = preDTO.getCantidadAConfeccionar();
	}

	public boolean sosLaPrenda(int numero) {
		return (numero == this.codigo); //revisar

	}
}
