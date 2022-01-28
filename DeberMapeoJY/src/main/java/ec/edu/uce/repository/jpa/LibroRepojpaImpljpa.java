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

import ec.edu.uce.modelo.Libro;
import ec.edu.uce.modelo.jpa.Clientejpa;
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
		return this.entityManager.find(Librojpa.class, id); 
	}

	@Override
	public void update(Librojpa libro) {
		this.entityManager.merge(libro);
	}

	@Override
	public void delete(Integer id) {
		Librojpa  libro=this.read(id);
		this.entityManager.remove(libro);
		}

	@Override
	public Librojpa buscarAutor(String autor) {
		Query miQuiery=this.entityManager.createQuery("select l from Librojpa l where l.autor=:valor");
		miQuiery.setParameter("valor", autor);
		Librojpa libro= (Librojpa) miQuiery.getSingleResult();
		return libro;
	}

	@Override
	public Librojpa buscarAutorNamed(String autor) {
		Query miQuiery=this.entityManager.createNamedQuery("Libro.buacarAutor");
		miQuiery.setParameter("valor", autor);
		Librojpa libro= (Librojpa) miQuiery.getSingleResult();
		return libro;
	}

	@Override
	public Librojpa buscarAutorTyped(String autor) {
		TypedQuery<Librojpa> miQuiery=(TypedQuery<Librojpa>) this.entityManager.createQuery("select l from Librojpa l where l.autor=:valor");
		miQuiery.setParameter("valor", autor);
		return miQuiery.getSingleResult();
	}

	@Override
	public Librojpa buscarAutorCriteriaAPI(String autor) {
		//1.- especifico el tipo de query
		CriteriaBuilder miCriteria=this.entityManager.getCriteriaBuilder();
		//2. especifico el tipo de retorno
		CriteriaQuery<Librojpa> miQuery=miCriteria.createQuery(Librojpa.class);
		//empezar a contruir el SQL
		//3.- defino el objeto que va a representar la tabla
		Root<Librojpa> miTabla=miQuery.from(Librojpa.class);
		//4.-Creo los predicados, que son los "where" de criteria API
		Predicate p1=miCriteria.equal(miTabla.get("autor"), autor);
		//5.-Armo el Query
		miQuery.select(miTabla).where(p1);
		//6.-creo un Typed Query
		TypedQuery<Librojpa> typedQuery=this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}

}
