package ec.edu.uce.repository;


import ec.edu.uce.modelo.NinioGuarderia;

public interface INinioGuarderiaRepo {

	public void create(NinioGuarderia ninioG);
	public NinioGuarderia read(Integer id); 
	public void update(NinioGuarderia ninioG); 
	public void delete(Integer id); 
}
