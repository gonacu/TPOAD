package persistencia;

import org.hibernate.Session;

import entities.ItemPedidoClienteEntity;
import negocio.ItemPedidoCliente;

public class ItemPedidoClienteDAO extends GenericDAO<ItemPedidoCliente> {

	@Override
	protected ItemPedidoCliente get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		ItemPedidoCliente itemPC = (ItemPedidoCliente) sesion.get(ItemPedidoClienteEntity.class, id);	
		sesion.close();		
		return itemPC;
	}

}
