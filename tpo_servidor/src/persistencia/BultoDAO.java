package persistencia;

import org.hibernate.Session;

import negocio.AreaProduccion;
import negocio.Bulto;

public class BultoDAO extends GenericDAO<Bulto> {

	@Override
	protected Bulto get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Bulto bulto = (Bulto) sesion.get(BultoEntity.class, id);	
		sesion.close();		
		return bulto;
	}

}
