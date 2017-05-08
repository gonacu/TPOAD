package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.PedidoCliente;

public class PedidoClienteDAO extends GenericDAO<PedidoCliente> {

	@Override
	protected PedidoCliente get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		PedidoCliente pedCliente = (PedidoCliente) sesion.get(PedidoClienteEntity.class, id);	
		sesion.close();		
		return pedCliente;
	}

}
