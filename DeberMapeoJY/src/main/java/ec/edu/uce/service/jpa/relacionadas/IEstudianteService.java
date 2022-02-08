package ec.edu.uce.service.jpa.relacionadas;

import java.util.List;

import ec.edu.uce.modelo.jpa.relacionadas.Estudiante;

public interface IEstudianteService {

	public void guardarEstudiate(Estudiante estudiante);
	public List<Estudiante> buscarPorApellidoJOIN(String apellido);
	public List<Estudiante> buscarPorApellidoLEFT(String apellido);
	public List<Estudiante> buscarPorApellidoRIGHT(String apellido);
	public List<Estudiante> buscarPorApellidoWHERE(String apellido);
}
