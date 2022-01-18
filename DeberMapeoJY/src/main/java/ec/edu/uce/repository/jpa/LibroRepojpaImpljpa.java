package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Libro;
import ec.edu.uce.modelo.jpa.Librojpa;
import ec.edu.uce.repository.ILibroRepo;

@Repository
@Transactional
public class LibroRepojpaImpljpa implements ILibroRepojpa{

	@PersistenceContext
	private EntityManager  entityManager;
	
	@Override
	public void create(Librojpa libro) {
		this.entityManager.persist(libro);
	}

	@Override
	public Librojpa read(Integer id) {
		return null; 
	}

	@Override
	public void update(Librojpa libro) {
		this.entityManager.merge(libro);
	}

	@Override
	public void delete(Integer id) {
		}

}
