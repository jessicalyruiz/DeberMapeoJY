package ec.edu.uce.service.jpa.relacionadas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.relacionadas.Estudiante;
import ec.edu.uce.repository.jpa.relacionadas.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	IEstudianteRepo estudianteRepo;
	
	@Override
	public void guardarEstudiate(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.guardarEstudiate(estudiante);
	}

	@Override
	public List<Estudiante> buscarPorApellidoJOIN(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoJOIN(apellido);
	}

	@Override
	public List<Estudiante> buscarPorApellidoLEFT(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoLEFT(apellido);
	}

	@Override
	public List<Estudiante> buscarPorApellidoRIGHT(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoRIGHT(apellido);
	}

	@Override
	public List<Estudiante> buscarPorApellidoWHERE(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoWHERE(apellido);
	}

}
