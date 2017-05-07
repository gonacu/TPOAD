package controladores;

import java.util.ArrayList;
import java.util.Date;

import dto.LoteInsumoDTO;
import dto.MovimientoStockDTO;
import negocio.Bulto;
import negocio.Insumo;
import negocio.LoteInsumo;
import negocio.MovimientoStock;
import negocio.MovimientoStockInsumo;
import negocio.MovimientoStockPrenda;
import negocio.PedidoCliente;
import negocio.Prenda;
import negocio.Proveedor;
import negocio.Ubicacion;

public class AdministradorStock {
	private ArrayList<LoteInsumo> lotesInsumos;
	private ArrayList<Bulto> bultos;
	private ArrayList<Ubicacion> ubicaciones;
	private ArrayList<MovimientoStock> movimientos;
	
	//public void agregarLoteInsumo(Date fechaRec, Proveedor prov, float cant, Insumo ins){
	public void agregarLoteInsumo(LoteInsumoDTO liDTO){
		this.lotesInsumos.add(new LoteInsumo(liDTO));
	}

	public void agregarBulto(Prenda prenda, String talle, String color, int cant) {

	}

	public void agregarUbicacionLoteInsumo(LoteInsumo loteIns) { //de donde sacaria la ubicacion en estos 2 metodos, vendria a ser otro parametro?

	}

	public void agrgarUbicacionBulto(int codigoBulto) {

	}

	private Insumo buscarInsumo(int codigo) {
		return null;

	}

	public void nuevoMovimientoStock(MovimientoStockDTO movDTO) {
	//  if (movDTO.esMovimientoInsumo)	
	//		this.movimientos.add(new MovimientoStockInsumo(movDTO));
	//	else
	//		this.movimientos.add(new MovimientoStockPrenda(movDTO));
	}

	private LoteInsumo buscarLoteInsumo(int codigo) {
		return null;

	}

	public MovimientoStock verificarMovimiento(int codigo) {
		return null;

	}

	public void quitarBulto(int codigoBulto) {

	}

	public void solicitarPrendas(PedidoCliente pedido) {

	}

	public boolean verificarStockPrenda(PedidoCliente pedido) {
		return false;

	}

	public boolean verificarStockInsumo(Insumo insumo, int cantidad){
		return false;
		
	}

	private Bulto buscarBulto(int codigoBulto) {
		return null;

	}
}
