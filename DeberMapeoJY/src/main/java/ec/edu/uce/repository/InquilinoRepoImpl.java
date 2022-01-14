package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Inquilino inquilino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
