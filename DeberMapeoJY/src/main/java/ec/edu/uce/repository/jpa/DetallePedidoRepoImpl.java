package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.relacionadas.DetallePedido;
import ec.edu.uce.modelo.jpa.relacionadas.Pedido;

@Repository
@Transactional
public class DetallePedidoRepoImpl implements IDetallePedidoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void guardarPedido(DetallePedido detalle) {
		// TODO Auto-generated method stub
		this.entityManager.persist(detalle);
	}
	
	
}
