package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Empleado;
import ec.edu.uce.modelo.jpa.Clientejpa;
import ec.edu.uce.modelo.jpa.Empleadojpa;
import ec.edu.uce.repository.IEmpleadoRepo;


@Repository
@Transactional
public class EpleadorRepojpaImpl implements IEmpleadoRepojpa{

	@PersistenceContext
	private EntityManager  entityManager;
	
	@Override
	public void create(Empleadojpa empleado) {

		this.entityManager.persist(empleado);
	}

	@Override
	public Empleadojpa read(Integer id) {
		return this.entityManager.find(Empleadojpa.class, id); 
	}

	@Override
	public void update(Empleadojpa empleado) {
		this.entityManager.merge(empleado);
	}

	@Override
	public void delete(Integer id) {
		Empleadojpa empleadoBorrar=this.read(id);
		this.entityManager.remove(empleadoBorrar);
		}

	@Override
	public Empleadojpa buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		Query query=this.entityManager.createQuery("select e from Empleadojpa e where e.apellido=:valor");
		query.setParameter("valor", apellido);
		Empleadojpa empleado=(Empleadojpa) query.getSingleResult();
		return empleado;
	}

	@Override
	public Empleadojpa buscarApellidoNamed(String apellido) {
		Query query=this.entityManager.createNamedQuery("Empleado.buscarApellido");
		query.setParameter("valor", apellido);
		Empleadojpa empleado=(Empleadojpa) query.getSingleResult();
		return empleado;
	}

	@Override
	public Empleadojpa buscarApellidoTyped(String apellido) {
		TypedQuery<Empleadojpa> query=(TypedQuery<Empleadojpa>) this.entityManager.createQuery("select e from Empleadojpa e where e.apellido=:valor");
		query.setParameter("valor", apellido);
		return query.getSingleResult();
	}

	@Override
	public Empleadojpa buscarApellidoCriteriaAPI(String apellido) {
		//1.- especifico el tipo de query
		CriteriaBuilder miCriteria=this.entityManager.getCriteriaBuilder();
		//2. especifico el tipo de retorno
		CriteriaQuery<Empleadojpa> miQuery=miCriteria.createQuery(Empleadojpa.class);
		//empezar a contruir el SQL
		//3.- defino el objeto que va a representar la tabla
		Root<Empleadojpa> miTabla=miQuery.from(Empleadojpa.class);
		//4.-Creo los predicados, que son los "where" de criteria API
		Predicate p1=miCriteria.equal(miTabla.get("apellido"), apellido);
		//5.-Armo el Query
		miQuery.select(miTabla).where(p1);
		//6.-creo un Typed Query
		TypedQuery<Empleadojpa> typedQuery=this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}

}
