package persistencia;

import org.hibernate.Session;

import entities.ItemPrendaAreaEntity;
import negocio.ItemPrendaArea;

public class ItemPrendaAreaDAO extends GenericDAO<ItemPrendaArea> {

	@Override
	protected ItemPrendaArea get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		ItemPrendaArea itemPA = (ItemPrendaArea) sesion.get(ItemPrendaAreaEntity.class, id);	
		sesion.close();		
		return itemPA;
	}

}
