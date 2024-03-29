package interfaces;

import java.rmi.Remote;

import dto.BultoDTO;
import dto.LoteInsumoDTO;
import dto.MovimientoStockDTO;
import dto.UbicacionBultoDTO;

public interface InterfazRemota extends Remote {
	public void agregarLoteInsumo(LoteInsumoDTO loteInsumo);

	public void agregarBulto(BultoDTO bulto);

	public void agregarUbicacionLoteInsumo(LoteInsumoDTO lote);

	public void agregarUbicacionBulto(UbicacionBultoDTO ubicacionBulto);

	public void nuevoMovStock(MovimientoStockDTO movimiento);
}
