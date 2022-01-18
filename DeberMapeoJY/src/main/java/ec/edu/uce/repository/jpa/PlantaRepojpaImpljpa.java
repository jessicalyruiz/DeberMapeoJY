package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.Planta;
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
		return null; 
	}

	@Override
	public void update(Plantajpa planta) {
		this.entityManager.merge(planta);
	}

	@Override
	public void delete(Integer id) {
		}

}
