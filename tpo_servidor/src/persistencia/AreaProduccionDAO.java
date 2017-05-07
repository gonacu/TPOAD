package persistencia;

import java.util.ArrayList;

import org.hibernate.Session;

import negocio.AreaProduccion;

public class AreaProduccionDAO extends GenericDAO<AreaProduccion> {

	@Override
	public AreaProduccion get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		AreaProduccion areaProd = (AreaProduccion) sesion.get(AreaProduccion.class, id);
		sesion.close();
		return areaProd;
	}

	public ArrayList<AreaProduccion> getAll(){
		
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		ArrayList<AreaProduccion> areasProd = new ArrayList<>();
		
		return null;		
	}
	
	
}
