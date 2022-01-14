package ec.edu.uce.service;


import ec.edu.uce.modelo.Pelicula;

public interface IPeliculaService {

	public void insertar(Pelicula pelicula);
	public Pelicula buscar(Integer id); 
	public void actualizar(Pelicula pelicula); 
	public void eliminar(Integer id); 
}
