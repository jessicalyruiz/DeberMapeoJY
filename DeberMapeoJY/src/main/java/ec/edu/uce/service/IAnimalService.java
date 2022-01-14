package ec.edu.uce.service;

import ec.edu.uce.modelo.Animal;

public interface IAnimalService {

	public void insertar(Animal animal);
	public Animal buscar(Integer id); 
	public void actualizar(Animal animal); 
	public void eliminar(Integer id); 
}
