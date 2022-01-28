package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.jpa.Animaljpa;

public interface IAnimalRepojpa {

	public void create(Animaljpa animal);
	public Animaljpa read(Integer id); 
	public void update(Animaljpa animal); 
	public void delete(Integer id); 
	public Animaljpa buscarEspecie(String especie);
	public Animaljpa buscarEspecieType(String especie);
	public Animaljpa buscarEspecieNamed(String especie);
	public Animaljpa buscarEspecieCriteriaAPI(String especie);
}
