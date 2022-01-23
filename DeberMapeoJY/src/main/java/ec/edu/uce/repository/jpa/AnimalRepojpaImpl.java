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


import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.jpa.Animaljpa;
import ec.edu.uce.repository.IAnimalRepo;


@Repository
@Transactional
public class AnimalRepojpaImpl implements IAnimalRepojpa {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(Animaljpa animal) {
		this.entityManager.persist(animal);
	}

	@Override
	public Animaljpa read(Integer id) {
		return this.entityManager.find(Animaljpa.class, id);
	}

	@Override
	public void update(Animaljpa animal) {
		this.entityManager.merge(animal);
	}

	@Override
	public void delete(Integer id) {
		Animaljpa animalBorar=this.read(id);
		this.entityManager.remove(animalBorar);
		}

	@Override
	public Animaljpa buscarEspecie(String especie) {
		
		Query query=this.entityManager.createQuery("Select a from Animaljpa a where a.especie=:valor");
		query.setParameter("valor", especie);
		Animaljpa animal= (Animaljpa) query.getSingleResult();
		return animal;
	}

	
	/**
	 *type query: cuando tengo la certeza  del tipo que va a retornar
	 */
	@Override
	public Animaljpa buscarEspecieType(String especie) {
		TypedQuery<Animaljpa> myTypedQuery=(TypedQuery<Animaljpa>) this.entityManager.createQuery("select a from Animaljpa a where a.especie=:valor");
		myTypedQuery.setParameter("valor", especie);
		return myTypedQuery.getSingleResult();
	}

	/**
	 *
	 */
	@Override
	public Animaljpa buscarEspecieNamed(String especie) {
		Query query=this.entityManager.createNamedQuery("Animal.buscarEspecieNamed");
		query.setParameter("valor", especie);
		Animaljpa animal=(Animaljpa) query.getSingleResult();
		return animal;
	}

	


}
