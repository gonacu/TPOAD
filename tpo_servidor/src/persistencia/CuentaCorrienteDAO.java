package persistencia;

import org.hibernate.Session;

import negocio.Bulto;
import negocio.CuentaCorriente;

public class CuentaCorrienteDAO extends GenericDAO<CuentaCorriente> {

	@Override
	protected CuentaCorriente get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		CuentaCorriente ctacte = (CuentaCorriente) sesion.get(CuentaCorrienteEntity.class, id);	
		sesion.close();		
		return ctacte;
	}

}
