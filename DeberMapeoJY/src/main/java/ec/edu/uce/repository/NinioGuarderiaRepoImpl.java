package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.NinioGuarderia;

@Repository
public class NinioGuarderiaRepoImpl implements INinioGuarderiaRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(NinioGuarderia ninioG) {
		// TODO Auto-generated method stub
		Object[] datosaInsertar=new Object[] {ninioG.getId(),ninioG.getNombre(), ninioG.getApellido(),ninioG.getAlergias(),ninioG.getPadres()};
		this.jdbcTemplate.update("insert into ninioguarderia (id,nombre,apellido,alergias,padres) values(?,?,?,?,?)",datosaInsertar);
	
	}

	@Override
	public NinioGuarderia read(Integer id) {
		Object[] datoABuscar=new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from ninioGuarderia where id=?", datoABuscar, new BeanPropertyRowMapper<NinioGuarderia>(NinioGuarderia.class));
		 
	}

	@Override
	public void update(NinioGuarderia ninioG) {
		Object[] datosaInsertar=new Object[] {ninioG.getId(),ninioG.getNombre(), ninioG.getApellido(),ninioG.getAlergias(),ninioG.getPadres(),ninioG.getId()};
		this.jdbcTemplate.update("update ninioguarderia set id=?,nombre= ?, apellido=? ,alergias=?,padres=? where id=",datosaInsertar);
	
	}

	@Override
	public void delete(Integer id) {
		Object[] datoABorrar=new Object[] {id};
		this.jdbcTemplate.update("delete from ninioguarderia where id=?",datoABorrar);
	}

}
