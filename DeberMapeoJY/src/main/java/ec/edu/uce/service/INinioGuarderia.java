package ec.edu.uce.service;


import ec.edu.uce.modelo.NinioGuarderia;

public interface INinioGuarderia {

	public void insertar(NinioGuarderia ninioGuarderia);
	public NinioGuarderia buscar(Integer id); 
	public void actualizar(NinioGuarderia ninioGuarderia); 
	public void eliminar(Integer id); 
}
