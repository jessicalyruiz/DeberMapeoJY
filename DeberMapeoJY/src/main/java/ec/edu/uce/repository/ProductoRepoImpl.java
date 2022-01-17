package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datoABuscar=new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from producto where codigo=?", datoABuscar, new BeanPropertyRowMapper<Producto>(Producto.class));
		 
	}

	@Override
	public void update(Producto producto) {
		Object[] datosAInsertar=new Object[] {producto.getCodigo(),producto.getNombre(), producto.getFechaElaboracion(), producto.getFechaVencimiento(), producto.getCantidad(), producto.getCodigo()};
		this.jdbcTemplate.update("update producto set codigo=?, nombre=?,fechaelaboracion=?,fechavencimiento=?, cantidad=? where codigo=?",datosAInsertar);
	
	}

	@Override
	public void delete(Integer id) {
		Object[] datoABorrar=new Object[] {id};
		this.jdbcTemplate.update("delete from producto where codigo=?",datoABorrar);
	
	}

}
