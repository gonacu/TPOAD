package persistencia;

import org.hibernate.Session;

import entities.OrdenProduccionEntity;
import negocio.OrdenProduccion;

public class OrdenProduccionDAO extends GenericDAO<OrdenProduccion> {

	@Override
	protected OrdenProduccion get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		OrdenProduccion ordenProd = (OrdenProduccion) sesion.get(OrdenProduccionEntity.class, id);	
		sesion.close();		
		return ordenProd;
	}

}
