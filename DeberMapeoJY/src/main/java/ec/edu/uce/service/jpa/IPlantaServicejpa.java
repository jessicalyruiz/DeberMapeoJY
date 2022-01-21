package ec.edu.uce.service.jpa;


import ec.edu.uce.modelo.Planta;
import ec.edu.uce.modelo.jpa.Plantajpa;

public interface IPlantaServicejpa {
	public void insertar(Plantajpa planta);
	public Plantajpa buscar(Integer id); 
	public void actualizar(Plantajpa planta); 
	public void eliminar(Integer id); 
	public Plantajpa buscarNombreComun(String nombre);
}
