package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.UbicacionBulto;

public class UbicacionBultoDAO extends GenericDAO<UbicacionBulto> {

	@Override
	protected UbicacionBulto get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		UbicacionBulto ubicbulto = (UbicacionBulto) sesion.get(UbicacionBultoEntity.class, id);	
		sesion.close();		
		return ubicbulto;
	}

}
