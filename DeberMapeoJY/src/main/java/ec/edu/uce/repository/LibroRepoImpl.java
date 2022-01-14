package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Libro;
@Repository
public class LibroRepoImpl implements ILibroRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Libro libro) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar=new Object[] {libro.getIsbn(),libro.getTitulo(),libro.getAutor(),libro.getSinopsis(),libro.getCantidad()};
		this.jdbcTemplate.update("insert into libro (isbn,titulo,autor,sinopsis,cantidad) values (?,?,?,?,?)",datosAInsertar);
	
	}

	@Override
	public Libro read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
