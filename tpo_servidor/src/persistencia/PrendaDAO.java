package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.Prenda;

public class PrendaDAO extends GenericDAO<Prenda> {

	@Override
	protected Prenda get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Prenda prenda = (Prenda) sesion.get(PrendaEntity.class, id);	
		sesion.close();		
		return prenda;
	}

}
