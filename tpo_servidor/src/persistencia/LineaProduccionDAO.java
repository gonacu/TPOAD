package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.LineaProduccion;

public class LineaProduccionDAO extends GenericDAO<LineaProduccion> {

	@Override
	protected LineaProduccion get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		LineaProduccion linea = (LineaProduccion) sesion.get(LineaProduccionEntity.class, id);	
		sesion.close();		
		return linea;
	}

}
