package ec.edu.uce.repository.jpa;



import ec.edu.uce.modelo.jpa.Empleadojpa;

public interface IEmpleadoRepojpa {

	public void create(Empleadojpa empleado);
	public Empleadojpa read(Integer id); 
	public void update(Empleadojpa empleado); 
	public void delete(Integer id); 
	public Empleadojpa buscarApellido(String apellido);
}
