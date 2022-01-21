package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.jpa.Clientejpa;
import ec.edu.uce.repository.IClienteRepo;

@Repository
@Transactional
public class ClienteRepojpaImpl implements IClienteRepojpa {

	@PersistenceContext
	private EntityManager  entityManager;
	
	@Override
	public void create(Clientejpa cliente) {
		this.entityManager.persist(cliente);
	}

	@Override
	public Clientejpa read(Integer id) {
		return this.entityManager.find(Clientejpa.class, id); 
	}

	@Override
	public void update(Clientejpa cliente) {
		this.entityManager.merge(cliente);
	}

	@Override
	public void delete(Integer id) {
		Clientejpa clienteBorrar=this.read(id);
		this.entityManager.remove(clienteBorrar);
		}

	@Override
	public Clientejpa buscarApellido(String apellido) {
		Query miQuery=this.entityManager.createQuery("select c from Clientejpa c where c.apellido=:valor");
		miQuery.setParameter("valor", apellido);
		Clientejpa cliente=(Clientejpa) miQuery.getSingleResult();
		return cliente;
	}

}
