package controladores;

import java.util.ArrayList;
import java.util.Date;

import negocio.Bulto;
import negocio.Insumo;
import negocio.PedidoCliente;
import negocio.Prenda;

public class AdministradorStock {
	private ArrayList<LoteInsumo> lotesInsumos;
	private ArrayList<Bulto> bultos;

	private ArryList<Ubicacion>
	private ArrayList<MovimientoStock>;
	
	public void agregarLoteInsumo(Date fechaRec, Proveedor prov, float cant, Insumo ins){
		
	}

	public void agregarBulto(Prenda prenda, String talle, String color, int cant) {

	}

	public void agregarUbicacionLoteInsumo(LoteInsumo loteIns) {

	}

	public void agrgarUbicacionBulto(int codigoBulto) {

	}

	private Insumo buscarInsumo(int codigo) {

	}

	public void nuevoMovimientoStock(ArrayList<String> datosMov) {

	}

	private LoteInsumo buscarLoteInsumo(int codigo) {

	}

	public MovimientoStock verificarMovimiento(int codigo) {

	}

	public void quitarBulto(int codigoBulto) {

	}

	public void solicitarPrendas(PedidoCliente pedido) {

	}

	public boolean verificarStockPrenda(PedidoCliente pedido) {

	}

	public boolean verificarStockInsumo(Insumo insumo, cantidad){
		
	}

	private Bulto buscarBulto(int codigoBulto) {

	}
}
