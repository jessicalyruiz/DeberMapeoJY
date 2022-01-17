package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cliente;

@Repository
public class ClienteRepoImpl implements IClienteRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Cliente cliente) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {cliente.getId(),cliente.getNombre(),cliente.getApellido(), cliente.getDireccion(),cliente.getEmail()};
		this.jdbcTemplate.update("insert into cliente (id,nombre, apellido, direccion, email) values (?,?,?,?,?)",datosAInsertar);
	
	}

	@Override
	public Cliente read(Integer id) {
		Object[] datoABuscar=new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from cliente where id=?", datoABuscar, new BeanPropertyRowMapper<Cliente>());
		 
	}

	@Override
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		Object[] datosAAcutalizar=new Object[] {cliente.getId(),cliente.getNombre(),cliente.getApellido(), cliente.getDireccion(),cliente.getEmail()};
		this.jdbcTemplate.update("insert into cliente (id=?,nombre=?, apellido=?, direccion=?, email=?) values (?,?,?,?,?)",datosAAcutalizar);
	
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar=new Object[] {id};
		this.jdbcTemplate.update("delete from cliente where id=?",datoABorrar);
	}

}
