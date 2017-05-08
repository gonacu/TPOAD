package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.MovimientoStock;

public class MovimientoStockDAO extends GenericDAO<MovimientoStock> {

	@Override
	protected MovimientoStock get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		MovimientoStock movStock = (MovimientoStock) sesion.get(MovimientoStockEntity.class, id);	
		sesion.close();		
		return movStock;
	}

}
