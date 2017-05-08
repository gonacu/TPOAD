package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.Proveedor;

public class ProveedorDAO extends GenericDAO<Proveedor> {

	@Override
	protected Proveedor get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Proveedor prov = (Proveedor) sesion.get(ProveedorEntity.class, id);	
		sesion.close();		
		return prov;
	}

}
