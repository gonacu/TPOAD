package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtil;

public abstract class GenericDAO<T> {
	
	protected static SessionFactory sf = HibernateUtil.getSessionFactory();

	protected abstract T get(Integer id);

	public Integer insert(Object o) {
		Session sesion;
		sesion = sf.openSession();
		sesion.beginTransaction();
		Integer id = (Integer)sesion.save(o);
		sesion.getTransaction().commit();
		sesion.close();
		return id;
	}

	public void delete(Object o) {
		Session sesion;
		sesion = sf.openSession();
		sesion.beginTransaction();
		sesion.delete(o);
		sesion.getTransaction().commit();
		sesion.close();
	}
	
	public void update(Object o) {
		Session sesion;
		sesion = sf.openSession();
		sesion.beginTransaction();
		sesion.update(o);
		sesion.getTransaction().commit();
		sesion.close();
	}

}
