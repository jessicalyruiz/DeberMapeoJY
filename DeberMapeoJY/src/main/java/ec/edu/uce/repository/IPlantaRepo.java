package ec.edu.uce.repository;


import ec.edu.uce.modelo.Planta;

public interface IPlantaRepo {

	public void create(Planta planta);
	public Planta read(Integer id); 
	public void update(Planta planta); 
	public void delete(Integer id); 
}
