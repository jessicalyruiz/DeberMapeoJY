package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Planta;
@Repository
public class PlantaRepoImpl implements IPlantaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Planta planta) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {planta.getId(), planta.getNombreComun(), planta.getNombreCientifico(), planta.getCuidados(), planta.getEdad()};
		this.jdbcTemplate.update("insert into planta (id,nombrecomun,nombrecientifico,cuidados, edad) values (?,?,?,?,?)",datosAInsertar);
	
	}

	@Override
	public Planta read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Planta planta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
