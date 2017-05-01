package negocio;

import java.util.Date;

import dto.ItemPrendaAreaDTO;

public class ItemPrendaArea {

	private Date minutoEnArea;
	private AreaProduccion area;
	
	public ItemPrendaArea(ItemPrendaAreaDTO ipaDTO) {
		this.minutoEnArea = ipaDTO.getMinutoEnArea();
		this.area = new AreaProduccion (ipaDTO.getArea());
	}
	
}
