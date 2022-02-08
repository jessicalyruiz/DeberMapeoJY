package ec.edu.uce.repository.jpa.relacionadas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.relacionadas.Estudiante;


public interface IEstudianteRepo {

	public void guardarEstudiate(Estudiante estudiante);
	
	public List<Estudiante> buscarPorApellidoJOIN(String apellido);
	public List<Estudiante> buscarPorApellidoLEFT(String apellido);
	public List<Estudiante> buscarPorApellidoRIGHT(String apellido);
	public List<Estudiante> buscarPorApellidoWHERE(String apellido);
}
