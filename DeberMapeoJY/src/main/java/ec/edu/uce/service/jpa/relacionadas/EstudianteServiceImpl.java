package ec.edu.uce.service.jpa.relacionadas;

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

}
