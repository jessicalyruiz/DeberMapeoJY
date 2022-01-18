package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.jpa.Clientejpa;

public interface IClienteServicejpa {

	public void insertar(Clientejpa cliente);
	public Clientejpa buscar(Integer id); 
	public void actualizar(Clientejpa cliente); 
	public void eliminar(Integer id); 
}
