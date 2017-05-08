package persistencia;

import org.hibernate.Session;

import entities.EmpleadoEntity;
import negocio.Empleado;

public class EmpleadoDAO extends GenericDAO<Empleado> {

	@Override
	protected Empleado get(Integer id) {
		Session sesion = sf.openSession();
		sesion.beginTransaction();
		Empleado emp = (Empleado) sesion.get(EmpleadoEntity.class, id);	
		sesion.close();		
		return emp;
	}

}
