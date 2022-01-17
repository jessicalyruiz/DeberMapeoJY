package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datoABuscar=new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from planta where id=?", datoABuscar, new BeanPropertyRowMapper<Planta>(Planta.class));
		 
	}

	@Override
	public void update(Planta planta) {
		Object[] datosAInsertar=new Object[] {planta.getId(), planta.getNombreComun(), planta.getNombreCientifico(), planta.getCuidados(), planta.getEdad(), planta.getId()};
		this.jdbcTemplate.update("uppdate plante set id=?,nombrecomun=?,nombrecientifico=?,cuidados=?, edad=? where id=?",datosAInsertar);
	
	}

	@Override
	public void delete(Integer id) {
		Object[] datoABorrar=new Object[] {id};
		this.jdbcTemplate.update("delete from planta where id=?",datoABorrar);
	}

}
