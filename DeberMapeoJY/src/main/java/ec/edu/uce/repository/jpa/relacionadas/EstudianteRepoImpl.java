package ec.edu.uce.repository.jpa.relacionadas;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.relacionadas.Estudiante;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void guardarEstudiate(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
	}
}
