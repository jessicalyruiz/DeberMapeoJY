package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(NinioGuarderia ninioG) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
