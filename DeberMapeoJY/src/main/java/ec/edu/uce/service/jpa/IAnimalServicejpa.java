package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.Animaljpa;

public interface IAnimalServicejpa {

	public void insertar(Animaljpa animal);
	public Animaljpa buscar(Integer id); 
	public void actualizar(Animaljpa animal); 
	public void eliminar(Integer id); 
	public Animaljpa buscarEspecie(String especie);
}
