package persistencia;

import org.hibernate.Session;

import entities.LoteInsumoEntity;
import negocio.LoteInsumo;

public class LoteInsumoDAO extends GenericDAO<LoteInsumo> {

	@Override
	protected LoteInsumo get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		LoteInsumo loteIns = (LoteInsumo) sesion.get(LoteInsumoEntity.class, id);	
		sesion.close();		
		return loteIns;
	}

}
