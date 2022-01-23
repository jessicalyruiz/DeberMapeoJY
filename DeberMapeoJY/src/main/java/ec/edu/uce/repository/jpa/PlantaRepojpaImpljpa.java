package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



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

}
