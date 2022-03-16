package ec.edu.uce.repository.test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.test.PolizaSeguro;

@Repository
@Transactional
public class PolizaRepoImpl implements IPolizaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(polizaSeguro);
	}

	@Override
	public PolizaSeguro read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(PolizaSeguro.class, id);
	}

	@Override
	public void update(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(polizaSeguro);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}
	
}
