package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Inquilino;

@Repository
public class InquilinoRepoImpl implements IInquilinoRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Inquilino inquilino) {
		// TODO Auto-generated method stub
		Object[] datosaInsertar=new Object[] {inquilino.getId(),inquilino.getNombre(), inquilino.getApellido(),inquilino.getNumDept(),inquilino.getNumMedidor(),inquilino.getRenta()};
		this.jdbcTemplate.update("insert into inquilino (id,nombre,apellido,numdept,nummedidor,renta) values(?,?,?,?,?,?)",datosaInsertar);
	}

	@Override
	public Inquilino read(Integer id) {
		Object[] datoABuscar=new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from inquilino where id=?", datoABuscar, new BeanPropertyRowMapper<Inquilino>(Inquilino.class));
		 
	}

	@Override
	public void update(Inquilino inquilino) {
		Object[] datosaInsertar=new Object[] {inquilino.getId(),inquilino.getNombre(), inquilino.getApellido(),inquilino.getNumDept(),inquilino.getNumMedidor(),inquilino.getRenta(), inquilino.getId()};
		this.jdbcTemplate.update("update inquilino set id=?,nombre=?,apellido=?,numdept=?,nummedidor=?,renta=? where id=?",datosaInsertar);

		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar=new Object[] {id};
		this.jdbcTemplate.update("delete from inquilino where id=?",datoABorrar);
	}

}
