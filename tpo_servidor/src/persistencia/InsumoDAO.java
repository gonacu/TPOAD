package persistencia;

import org.hibernate.Session;

import entities.InsumoEntity;
import negocio.Insumo;

public class InsumoDAO extends GenericDAO<Insumo> {

	@Override
	protected Insumo get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Insumo insumo = (Insumo) sesion.get(InsumoEntity.class, id);	
		sesion.close();		
		return insumo;
	}

}
