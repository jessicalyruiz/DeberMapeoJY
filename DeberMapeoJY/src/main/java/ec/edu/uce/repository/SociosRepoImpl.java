package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.Socios;
@Repository
public class SociosRepoImpl implements  ISociosRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Socios socios) {
		// TODO Auto-generated method stub
		Object[] datosaInsertar=new Object[] {socios.getId(),socios.getNombre(), socios.getApellido(),socios.getAportes(), socios.getMembresia()};
		this.jdbcTemplate.update("insert into socios (id,nombre,apellido,aportes,membresia) values(?,?,?,?,?)",datosaInsertar);
	}

	@Override
	public Socios read(Integer id) {
		Object[] datoABuscar=new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from socios where id=?", datoABuscar, new BeanPropertyRowMapper<Socios>(Socios.class));
		 
	}

	@Override
	public void update(Socios socios) {
		Object[] datosaInsertar=new Object[] {socios.getId(),socios.getNombre(), socios.getApellido(),socios.getAportes(), socios.getMembresia(), socios.getId()};
		this.jdbcTemplate.update("set id=?,nombre= ?, apellido=? ,aportes =?,membresia=? where id=?",datosaInsertar);
	
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar=new Object[] {id};
		this.jdbcTemplate.update("delete from socios where id=?",datoABorrar);
	}

}
