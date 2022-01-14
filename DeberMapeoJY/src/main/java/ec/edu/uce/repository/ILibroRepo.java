package ec.edu.uce.repository;


import ec.edu.uce.modelo.Libro;

public interface ILibroRepo {

	public void create(Libro libro);
	public Libro read(Integer id); 
	public void update(Libro libro); 
	public void delete(Integer id); 
}
