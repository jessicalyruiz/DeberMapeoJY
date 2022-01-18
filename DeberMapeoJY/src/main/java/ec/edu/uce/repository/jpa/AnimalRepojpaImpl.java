package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
		return null;
	}

	@Override
	public void update(Animaljpa animal) {
		this.entityManager.merge(animal);
	}

	@Override
	public void delete(Integer id) {
		}

	


}
