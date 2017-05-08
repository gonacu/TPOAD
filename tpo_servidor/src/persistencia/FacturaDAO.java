package persistencia;

import org.hibernate.Session;

import entities.FacturaEntity;
import negocio.Factura;

public class FacturaDAO extends GenericDAO<Factura> {

	@Override
	protected Factura get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Factura fact = (Factura) sesion.get(FacturaEntity.class, id);	
		sesion.close();		
		return fact;
	}

}
