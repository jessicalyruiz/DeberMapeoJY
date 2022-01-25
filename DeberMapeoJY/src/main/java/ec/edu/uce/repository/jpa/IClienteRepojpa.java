package ec.edu.uce.repository.jpa;


import ec.edu.uce.modelo.jpa.Clientejpa;

public interface IClienteRepojpa {

	public void create(Clientejpa cliente);
	public Clientejpa read(Integer id); 
	public void update(Clientejpa cliente); 
	public void delete(Integer id); 
	public Clientejpa buscarApellido(String apellido); 
	public Clientejpa buscarApellidoNamed(String apellido); 
	public Clientejpa buscarApellidoTyped(String apellido); 
	public Clientejpa buscarApellidoNative(String apellido); 
}
