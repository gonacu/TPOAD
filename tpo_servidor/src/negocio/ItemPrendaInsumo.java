package negocio;

import dto.ItemPrendaInsumoDTO;

public class ItemPrendaInsumo {

	private Insumo insumo;
	private float cantidad;
	private float desperdicio;
	
	public ItemPrendaInsumo(ItemPrendaInsumoDTO ipiDTO) {
		this.insumo = new Insumo(ipiDTO.getInsumo());
		this.cantidad = ipiDTO.getCantidad();
		this.desperdicio = ipiDTO.getDesperdicio();
	}
}
