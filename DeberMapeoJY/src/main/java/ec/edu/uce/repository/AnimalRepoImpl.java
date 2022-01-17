package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datoABuscar=new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from animal where id=?", datoABuscar, new BeanPropertyRowMapper<Animal>());
		 
	}

	@Override
	public void update(Animal animal) {
		Object[] datosAAcutalizar=new Object[] {animal.getId(),animal.getEspecie(),animal.getCuidados(), animal.getNombre(),animal.getEdad()};
		this.jdbcTemplate.update("update animal set id=?,especie=?,cuidados=?,nombre=?, edad=?  where id=?", datosAAcutalizar);

	}

	@Override
	public void delete(Integer id) {
		Object[] datoABorrar=new Object[] {id};
		this.jdbcTemplate.update("delete from animal where id=?",datoABorrar);
	}

}
