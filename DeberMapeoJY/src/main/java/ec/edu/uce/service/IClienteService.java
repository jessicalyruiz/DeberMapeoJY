package ec.edu.uce.service;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.Cliente;

public interface IClienteService {

	public void insertar(Cliente cliente);
	public Cliente buscar(Integer id); 
	public void actualizar(Cliente cliente); 
	public void eliminar(Integer id); 
	
}
