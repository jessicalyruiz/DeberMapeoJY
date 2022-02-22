package ec.edu.uce.repository.jpa.relacionadas;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.relacionadas.Consumo;

@Repository
@Transactional
public class ConsumoRepo implements IConsumoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(Consumo consumo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(consumo);
	}

	@Override
	public Consumo read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Consumo.class, id);
	}

	@Override
	public void update(Consumo consumo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(consumo);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Consumo consumoBorrar=this.read(id);
		this.entityManager.remove(consumoBorrar);
	}

	@Override
	public Consumo buscarValorConsumo(BigDecimal valor) {
		// TODO Auto-generated method stub
		TypedQuery< Consumo> myQuery=this.entityManager.createQuery("Select c from Consumo c where c.valor=:valor",Consumo.class);
		myQuery.setParameter("valor", valor);
		
		return myQuery.getSingleResult();
	}

}
