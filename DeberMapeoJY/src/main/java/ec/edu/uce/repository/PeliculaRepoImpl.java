package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.Pelicula;
@Repository
public class PeliculaRepoImpl implements IPeliculaRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Pelicula pelicula) {
		// TODO Auto-generated method stub
		Object [] datosAInsertar=new Object[] {pelicula.getCodigo(),pelicula.getActorPrincipal(),pelicula.getSinopsis(),pelicula.getTitulo(),pelicula.getVecesVista()};
		this.jdbcTemplate.update("insert into pelicula(codigo,actorprincipal, sinopsis,titulo,vecesvista) values(?,?,?,?,?) ", datosAInsertar);
		
	}

	@Override
	public Pelicula read(Integer id) {
		Object[] datoABuscar=new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from pelicula where codigo=?", datoABuscar, new BeanPropertyRowMapper<Pelicula>(Pelicula.class));
		 
	}

	@Override
	public void update(Pelicula pelicula) {
		Object [] datosAAcutalizar=new Object[] {pelicula.getCodigo(),pelicula.getActorPrincipal(),pelicula.getSinopsis(),pelicula.getTitulo(),pelicula.getVecesVista(),pelicula.getCodigo()};
		this.jdbcTemplate.update("update pelicula set codigo=?,actorprincipal=?, sinopsis=?,titulo=?,vecesvista=? where codigo=? ", datosAAcutalizar);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar=new Object[] {id};
		this.jdbcTemplate.update("delete from pelicula where id=?",datoABorrar);
	}

}
