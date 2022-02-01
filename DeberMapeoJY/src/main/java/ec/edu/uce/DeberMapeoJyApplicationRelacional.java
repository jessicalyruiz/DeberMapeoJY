package ec.edu.uce;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import ec.edu.uce.modelo.jpa.relacionadas.DetallePedido;
import ec.edu.uce.modelo.jpa.relacionadas.Pedido;

import ec.edu.uce.service.jpa.IDetallePedidoService;
import ec.edu.uce.service.jpa.IPedidoService;

@SpringBootApplication
public class DeberMapeoJyApplicationRelacional implements CommandLineRunner{
	
	@Autowired
	private IPedidoService pedidoService;
	
	@Autowired 
	private IDetallePedidoService detallePService;
	
	public static void main(String[] args) {
		SpringApplication.run(DeberMapeoJyApplicationRelacional.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		
		Pedido pedido=new Pedido();
		pedido.setCliente("Jessica Yanez");
		pedido.setFecha(LocalDateTime.now());
		pedido.setNumero("123-78");
		
		List<DetallePedido> detalles=new ArrayList<>();
		
		DetallePedido detalle=new DetallePedido();
		detalle.setCantidad(5);
		detalle.setPedido(pedido);
		detalle.setPrecio(new BigDecimal(78.92));
		detalle.setProducto("Maquillaje");
		
		DetallePedido detalle2=new DetallePedido();
		detalle2.setCantidad(8);
		detalle2.setPedido(pedido);
		detalle2.setPrecio(new BigDecimal(200.54));
		detalle2.setProducto("Ropa");
		
		detalles.add(detalle);
		detalles.add(detalle2);
		
		pedido.setDetalles(detalles);
		this.pedidoService.guardarPedido(pedido);
	}

}
