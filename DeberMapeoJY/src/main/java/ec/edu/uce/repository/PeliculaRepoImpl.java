package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
