package ec.edu.uce.service.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.relacionadas.DetallePedido;
import ec.edu.uce.modelo.jpa.relacionadas.Pedido;
import ec.edu.uce.repository.jpa.IDetallePedidoRepo;

@Service
public class DetallePedidoServiceImpl implements IDetallePedidoService {

	@Autowired
	IDetallePedidoRepo detalleRepo;
	
	@Override
	public void guardarPedido(DetallePedido detalle) {
		// TODO Auto-generated method stub
		detalleRepo.guardarPedido(detalle);
	}

	
	
}
