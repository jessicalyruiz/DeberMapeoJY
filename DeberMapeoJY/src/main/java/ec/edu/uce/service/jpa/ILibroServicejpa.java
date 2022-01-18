package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.Libro;
import ec.edu.uce.modelo.jpa.Librojpa;

public interface ILibroServicejpa {

	public void insertar(Librojpa libro);
	public Librojpa buscar(Integer id); 
	public void actualizar(Librojpa libro); 
	public void eliminar(Integer id); 
}
