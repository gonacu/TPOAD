package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.Sucursal;

public class SucursalDAO extends GenericDAO<Sucursal> {

	@Override
	protected Sucursal get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Sucursal sucursal = (Sucursal) sesion.get(SucursalEntity.class, id);	
		sesion.close();		
		return sucursal;
	}

}
