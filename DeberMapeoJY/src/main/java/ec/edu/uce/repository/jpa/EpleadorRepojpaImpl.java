package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Empleado;
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
		return null; 
	}

	@Override
	public void update(Empleadojpa empleado) {
		this.entityManager.merge(empleado);
	}

	@Override
	public void delete(Integer id) {
		}

}