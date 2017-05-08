package persistencia;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;

import negocio.AreaProduccion;

public class AreaProduccionDAO extends GenericDAO<AreaProduccion> {

	@Override
	public AreaProduccion get(Integer id){
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		AreaProduccion areaProd = (AreaProduccion) sesion.get(AreaProduccionEntity.class, id);
		//no hace falta hacer una query si solo buscamos por id
		sesion.close();		
		return areaProd;		
	}
	//Revisar getAll()
	
	@SuppressWarnings("unchecked")
	public ArrayList<AreaProduccion> getAll(){
		
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		ArrayList<AreaProduccion> areasProd = new ArrayList<>();
		Query query = sesion.createQuery("rom Areas");
		areasProd = (ArrayList<AreaProduccion>) query.list();
		sesion.close();
		return areasProd;		
	}
	
	
}
