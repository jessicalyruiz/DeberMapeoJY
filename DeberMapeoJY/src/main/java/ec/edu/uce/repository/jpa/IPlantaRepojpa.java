package ec.edu.uce.repository.jpa;



import ec.edu.uce.modelo.jpa.Plantajpa;

public interface IPlantaRepojpa {

	public void create(Plantajpa planta);
	public Plantajpa read(Integer id); 
	public void update(Plantajpa planta); 
	public void delete(Integer id); 
	public Plantajpa buscarNombreComun(String nombre);
	public Plantajpa buscarNombreComunNamed(String nombre);
	public Plantajpa buscarNombreComunTyped(String nombre);
	public Plantajpa buscarNombreComunCriteriaAPI(String nombre);
	
}
