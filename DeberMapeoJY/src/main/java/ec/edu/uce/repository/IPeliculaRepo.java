package ec.edu.uce.repository;

import ec.edu.uce.modelo.Pelicula;

public interface IPeliculaRepo {

	public void create(Pelicula pelicula);
	public Pelicula read(Integer id); 
	public void update(Pelicula pelicula); 
	public void delete(Integer id); 
}
