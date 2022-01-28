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

import ec.edu.uce.modelo.jpa.Librojpa;
import ec.edu.uce.modelo.jpa.Plantajpa;
import ec.edu.uce.repository.IPlantaRepo;
@Repository
@Transactional
public class PlantaRepojpaImpljpa implements IPlantaRepojpa {

	@PersistenceContext
	private EntityManager  entityManager;
	
	@Override
	public void create(Plantajpa planta) {
		this.entityManager.persist(planta);
	}

	@Override
	public Plantajpa read(Integer id) {
		return this.entityManager.find(Plantajpa.class, id); 
	}

	@Override
	public void update(Plantajpa planta) {
		this.entityManager.merge(planta);
	}

	@Override
	public void delete(Integer id) {
		Plantajpa planta=this.read(id);
		this.entityManager.remove(planta);
		}

	@Override
	public Plantajpa buscarNombreComun(String nombre) {
		// TODO Auto-generated method stub
		Query miQuiery=this.entityManager.createQuery("select p from Plantajpa p where p.nombreComun=:valor");
		miQuiery.setParameter("valor", nombre);
		Plantajpa planta=(Plantajpa) miQuiery.getSingleResult();
		return planta;
	}

	@Override
	public Plantajpa buscarNombreComunNamed(String nombre) {
		Query miQuiery=this.entityManager.createNamedQuery("Planta.buscarNombreComunNamed");
		miQuiery.setParameter("valor", nombre);
		Plantajpa planta=(Plantajpa) miQuiery.getSingleResult();
		return planta;
	}

	@Override
	public Plantajpa buscarNombreComunTyped(String nombre) {
		TypedQuery<Plantajpa> miQuiery=(TypedQuery<Plantajpa>) this.entityManager.createQuery("select p from Plantajpa p where p.nombreComun=:valor");
		miQuiery.setParameter("valor", nombre);
		return miQuiery.getSingleResult();
	}

	@Override
	public Plantajpa buscarNombreComunCriteriaAPI(String nombre) {
				//1.- especifico el tipo de query
				CriteriaBuilder miCriteria=this.entityManager.getCriteriaBuilder();
				//2. especifico el tipo de retorno
				CriteriaQuery<Plantajpa> miQuery=miCriteria.createQuery(Plantajpa.class);
				//empezar a contruir el SQL
				//3.- defino el objeto que va a representar la tabla
				Root<Plantajpa> miTabla=miQuery.from(Plantajpa.class);
				//4.-Creo los predicados, que son los "where" de criteria API
				Predicate p1=miCriteria.equal(miTabla.get("nombreComun"), nombre);
				//5.-Armo el Query
				miQuery.select(miTabla).where(p1);
				//6.-creo un Typed Query
				TypedQuery<Plantajpa> typedQuery=this.entityManager.createQuery(miQuery);
				
				return typedQuery.getSingleResult();
	}

}
