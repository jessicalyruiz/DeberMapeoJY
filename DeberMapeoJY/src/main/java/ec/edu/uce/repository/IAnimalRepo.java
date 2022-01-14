package ec.edu.uce.repository;

import ec.edu.uce.modelo.Animal;

public interface IAnimalRepo {

	public void create(Animal animal);
	public Animal read(Integer id); 
	public void update(Animal animal); 
	public void delete(Integer id); 
}
