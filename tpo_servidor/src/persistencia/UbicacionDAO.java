package persistencia;

import org.hibernate.Session;

import entities.UbicacionEntity;
import negocio.Ubicacion;

public class UbicacionDAO extends GenericDAO<Ubicacion> {

	@Override
	protected Ubicacion get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Ubicacion ubic = (Ubicacion) sesion.get(UbicacionEntity.class, id);	
		sesion.close();		
		return ubic;
	}

}
