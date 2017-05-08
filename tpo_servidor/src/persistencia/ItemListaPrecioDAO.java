package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.ItemListaPrecio;

public class ItemListaPrecioDAO extends GenericDAO<ItemListaPrecio> {

	@Override
	protected ItemListaPrecio get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		ItemListaPrecio itemLP = (ItemListaPrecio) sesion.get(ItemListaPrecioEntity.class, id);	
		sesion.close();		
		return itemLP;
	}

}
