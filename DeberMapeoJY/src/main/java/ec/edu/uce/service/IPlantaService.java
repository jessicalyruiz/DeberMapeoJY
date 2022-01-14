package ec.edu.uce.service;


import ec.edu.uce.modelo.Planta;

public interface IPlantaService {
	public void insertar(Planta planta);
	public Planta buscar(Integer id); 
	public void actualizar(Planta planta); 
	public void eliminar(Integer id); 
}
