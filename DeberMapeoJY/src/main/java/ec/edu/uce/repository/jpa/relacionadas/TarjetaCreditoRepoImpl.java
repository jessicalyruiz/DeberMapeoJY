package ec.edu.uce.repository.jpa.relacionadas;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.DeberMapeoJyApplication2;
import ec.edu.uce.modelo.jpa.relacionadas.TarjetaCredito;


@Repository
@Transactional
public class TarjetaCreditoRepoImpl implements ITarjetaCreditoRepo{

	private static final Logger LOG= (Logger) LoggerFactory.getLogger(DeberMapeoJyApplication2.class);
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(TarjetaCredito tarjeta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(tarjeta);
	}

	@Override
	public TarjetaCredito read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(TarjetaCredito.class, id);
	}

	@Override
	public void update(TarjetaCredito tarjeta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(tarjeta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		TarjetaCredito tajetaBorrar=this.read(id);
		this.entityManager.remove(tajetaBorrar);
	}

	@Override
	public TarjetaCredito buscarNumeroTarjeta(String numero) {
		TypedQuery< TarjetaCredito> myQuery=this.entityManager.createQuery("Select t from TarjetaCredito t where t.numero=:valor",TarjetaCredito.class);
		myQuery.setParameter("valor", numero);
		return myQuery.getSingleResult();
	}

	@Override
	public void actualizar(TarjetaCredito tarjeta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(tarjeta);
		try {
				throw new NullPointerException();
				}catch (NullPointerException e) {
					LOG.error("Error en repository  Actualizar");
			}
	}
}
