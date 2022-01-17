package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datoABuscar=new Object[] {id};
		return this.jdbcTemplate.queryForObject("select * from libro where isbn=?", datoABuscar, new BeanPropertyRowMapper<Libro>(Libro.class));
		 
	}

	@Override
	public void update(Libro libro) {
		// TODO Auto-generated method stub
		Object[] datosAAcutalizar=new Object[] {libro.getIsbn(),libro.getTitulo(),libro.getAutor(),libro.getSinopsis(),libro.getCantidad(),libro.getIsbn()};
		this.jdbcTemplate.update("update libro set isbn=?,titulo=?,autor=?,sinopsis=?,cantidad=? where isbn=? ", datosAAcutalizar);
	}

	@Override
	public void delete(Integer id) {
		Object[] datoABorrar=new Object[] {id};
		this.jdbcTemplate.update("delete from libro where id=?",datoABorrar);
	
	}

}
