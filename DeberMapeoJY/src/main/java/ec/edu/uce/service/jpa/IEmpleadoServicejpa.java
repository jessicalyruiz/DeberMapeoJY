package ec.edu.uce.service.jpa;


import ec.edu.uce.modelo.Empleado;
import ec.edu.uce.modelo.jpa.Empleadojpa;

public interface IEmpleadoServicejpa {

	public void insertar(Empleadojpa empleado);
	public Empleadojpa buscar(Integer id); 
	public void actualizar(Empleadojpa empleado); 
	public void eliminar(Integer id); 
	public Empleadojpa buscarApellido(String apellido);
	public Empleadojpa buscarApellidoNamed(String apellido);
	public Empleadojpa buscarApellidoTyped(String apellido);
	public Empleadojpa buscarApellidoCriteriaAPI(String apellido);
}
