package ec.edu.uce.service;


import ec.edu.uce.modelo.Empleado;

public interface IEmpleadoService {

	public void insertar(Empleado empleado);
	public Empleado buscar(Integer id); 
	public void actualizar(Empleado empleado); 
	public void eliminar(Integer id); 
}
