package persistencia;

import org.hibernate.Session;

import entities.LoteEntity;
import negocio.Lote;

public class LoteDAO extends GenericDAO<Lote> {

	@Override
	protected Lote get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Lote lote = (Lote) sesion.get(LoteEntity.class, id);	
		sesion.close();		
		return lote;
	}

}
