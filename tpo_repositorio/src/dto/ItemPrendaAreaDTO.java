package dto;

import java.util.Date;

public class ItemPrendaAreaDTO {
	private Date minutoEnArea;
	private AreaProduccionDTO area;

	public Date getMinutoEnArea() {
		return minutoEnArea;
	}

	public void setMinutoEnArea(Date minutoEnArea) {
		this.minutoEnArea = minutoEnArea;
	}

	public AreaProduccionDTO getArea() {
		return area;
	}

	public void setArea(AreaProduccionDTO area) {
		this.area = area;
	}
}
