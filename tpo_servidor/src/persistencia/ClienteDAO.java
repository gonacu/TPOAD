package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> {

	@Override
	protected Cliente get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Cliente cliente = (Cliente) sesion.get(ClienteEntity.class, id);	
		sesion.close();		
		return cliente;
	}

}
