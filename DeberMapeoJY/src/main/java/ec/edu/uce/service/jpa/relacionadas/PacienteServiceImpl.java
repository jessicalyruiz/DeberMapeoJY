package ec.edu.uce.service.jpa.relacionadas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.relacionadas.Estudiante;
import ec.edu.uce.modelo.jpa.relacionadas.Paciente;
import ec.edu.uce.repository.jpa.relacionadas.IEstudianteRepo;
import ec.edu.uce.repository.jpa.relacionadas.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	IPacienteRepo pacienteRepo;

	@Override
	public void guardarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.guardarPaciente(paciente);
	}


}
