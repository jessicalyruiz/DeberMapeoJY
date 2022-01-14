package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Producto;
@Repository
public class ProductoRepoImpl implements IProductoRepo{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {producto.getCodigo(),producto.getNombre(), producto.getFechaElaboracion(), producto.getFechaVencimiento(), producto.getCantidad()};
		this.jdbcTemplate.update("insert into producto (codigo, nombre,fechaelaboracion,fechavencimiento, cantidad) values (?,?,?,?,?)",datosAInsertar);
	
	}

	@Override
	public Producto read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
