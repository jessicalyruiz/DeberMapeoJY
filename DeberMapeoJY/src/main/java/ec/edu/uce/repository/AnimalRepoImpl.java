package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.Animal;

@Repository
public class AnimalRepoImpl implements IAnimalRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Animal animal) {
		// TODO Auto-generated method stub
		//insert into paciente (id,nombre,apellido, edad)values (1,'jessi','yanez',29)
				Object[] datosAInsertar=new Object[] {animal.getId(),animal.getEspecie(),animal.getCuidados(), animal.getNombre(),animal.getEdad()};
				this.jdbcTemplate.update("insert into animal (id,especie,cuidados,nombre, edad) values (?,?,?,?,?)",datosAInsertar);
			
	}

	@Override
	public Animal read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Animal animal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
