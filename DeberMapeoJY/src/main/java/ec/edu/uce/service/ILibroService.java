package ec.edu.uce.service;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.Libro;

public interface ILibroService {

	public void insertar(Libro libro);
	public Libro buscar(Integer id); 
	public void actualizar(Libro libro); 
	public void eliminar(Integer id); 
}
