package ec.edu.uce.repository.jpa.relacionadas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.jpa.relacionadas.Estudiante;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

	private static final Logger LOG= (Logger) LoggerFactory.getLogger(EstudianteRepoImpl.class);
	

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void guardarEstudiate(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
	}

	@Override
	public List<Estudiante> buscarPorApellidoJOIN(String apellido) {
		TypedQuery<Estudiante> myQuery=this.entityManager.createQuery("SELECT e FROM Estudiante e JOIN e.matricula m WHERE e.apellido=: apellido", Estudiante.class);
		
		myQuery.setParameter("apellido", apellido);
		List<Estudiante> listaEstudiante=myQuery.getResultList();
		LOG.info("Longitud REpo "+listaEstudiante.size());
		for(Estudiante e: listaEstudiante) {
			LOG.info("detalles "+e.getMatricula());
			LOG.info(e.toString());
		}
		
		
		return listaEstudiante;
	
	}

	@Override
	public List<Estudiante> buscarPorApellidoLEFT(String apellido) {
TypedQuery<Estudiante> myQuery=this.entityManager.createQuery("SELECT e FROM Estudiante e LEFT JOIN e.matricula m WHERE e.apellido=: apellido", Estudiante.class);
		
		myQuery.setParameter("apellido", apellido);
		List<Estudiante> listaEstudiante=myQuery.getResultList();
		LOG.info("Longitud REpo "+listaEstudiante.size());
		for(Estudiante e: listaEstudiante) {
			LOG.info("detalles "+e.getMatricula());
			LOG.info(e.toString());
		}
		
		
		return listaEstudiante;
	}

	@Override
	public List<Estudiante> buscarPorApellidoRIGHT(String apellido) {
TypedQuery<Estudiante> myQuery=this.entityManager.createQuery("SELECT e FROM Estudiante e RIGHT JOIN e.matricula m WHERE e.apellido=: apellido", Estudiante.class);
		
		myQuery.setParameter("apellido", apellido);
		List<Estudiante> listaEstudiante=myQuery.getResultList();
		LOG.info("Longitud REpo "+listaEstudiante.size());
		for(Estudiante e: listaEstudiante) {
			LOG.info("detalles "+e.getMatricula());
			LOG.info(e.toString());
		}
		
		
		return listaEstudiante;
	}

	@Override
	public List<Estudiante> buscarPorApellidoWHERE(String apellido) {
		TypedQuery<Estudiante> myQuery=this.entityManager.createQuery("SELECT e FROM Estudiante e , Matricula m WHERE e=m.estudiante AND e.apellido=:apellido", Estudiante.class);
		myQuery.setParameter("apellido", apellido);
		
		
				List<Estudiante> listaEstudiante=myQuery.getResultList();
				LOG.info("Longitud REpo "+listaEstudiante.size());
				for(Estudiante e: listaEstudiante) {
					LOG.info("detalles "+e.getApellido());
					LOG.info(e.toString());
				}
				
				
				return listaEstudiante;
		
	}
}
