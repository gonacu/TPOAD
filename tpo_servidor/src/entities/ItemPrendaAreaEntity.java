package entities;

import java.util.Date;

public class ItemPrendaAreaEntity {
	private Date minutoEnArea;
	private AreaProduccionEntity area;

	public Date getMinutoEnArea() {
		return minutoEnArea;
	}

	public void setMinutoEnArea(Date minutoEnArea) {
		this.minutoEnArea = minutoEnArea;
	}

	public AreaProduccionEntity getArea() {
		return area;
	}

	public void setArea(AreaProduccionEntity area) {
		this.area = area;
	}
}
