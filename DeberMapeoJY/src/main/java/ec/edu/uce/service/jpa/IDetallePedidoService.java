package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.relacionadas.DetallePedido;
import ec.edu.uce.modelo.jpa.relacionadas.Pedido;

public interface IDetallePedidoService {

	public void guardarPedido(DetallePedido detalle);
//	public void borrarPedidoId(Integer id);
//	public void actualizarPedido(Pedido pedido);
//	public Pedido buscarPedidoId(Integer id);
}
