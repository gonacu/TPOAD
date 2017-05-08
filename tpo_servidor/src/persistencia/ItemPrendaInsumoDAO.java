package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.ItemPrendaInsumo;

public class ItemPrendaInsumoDAO extends GenericDAO<ItemPrendaInsumo> {

	@Override
	protected ItemPrendaInsumo get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		ItemPrendaInsumo itemPI = (ItemPrendaInsumo) sesion.get(ItemPrendaInsumoEntity.class, id);	
		sesion.close();		
		return itemPI;
	}

}
