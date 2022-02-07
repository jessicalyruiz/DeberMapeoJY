package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.jpa.Animaljpa;
import ec.edu.uce.modelo.jpa.Clientejpa;
import ec.edu.uce.modelo.jpa.Empleadojpa;
import ec.edu.uce.modelo.jpa.Librojpa;
import ec.edu.uce.modelo.jpa.Plantajpa;
import ec.edu.uce.modelo.jpa.relacionadas.Estudiante;
import ec.edu.uce.modelo.jpa.relacionadas.HistoriaClinica;
import ec.edu.uce.modelo.jpa.relacionadas.Matricula;
import ec.edu.uce.modelo.jpa.relacionadas.Paciente;
import ec.edu.uce.repository.jpa.relacionadas.IPacienteRepo;
import ec.edu.uce.service.jpa.IAnimalServicejpa;
import ec.edu.uce.service.jpa.IClienteServicejpa;
import ec.edu.uce.service.jpa.IEmpleadoServicejpa;
import ec.edu.uce.service.jpa.ILibroServicejpa;
import ec.edu.uce.service.jpa.IPlantaServicejpa;
import ec.edu.uce.service.jpa.relacionadas.IEstudianteService;
import ec.edu.uce.service.jpa.relacionadas.IPacienteService;



@SpringBootApplication
public class DeberMapeoJyApplication2 implements CommandLineRunner{
	
	private static final Logger LOG= (Logger) LoggerFactory.getLogger(DeberMapeoJyApplication2.class);
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(DeberMapeoJyApplication2.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		
		Estudiante estudiante=new Estudiante();
		estudiante.setApellido("Yanez");
		estudiante.setNombre("Jessi");
		estudiante.setCedula("2300115066");
	
		Matricula matricula=new Matricula();
		matricula.setNumero("45-78-56");
		matricula.setColegiatura(new BigDecimal(0));
		
		estudiante.setMatricula(matricula);
		this.estudianteService.guardarEstudiate(estudiante);
		
		
		//segundo ejemplo
		
		Paciente paciente=new Paciente();
		paciente.setApellido("Vera");
		paciente.setNombre("Maria");
		paciente.setEdad("30");
		
		HistoriaClinica historia=new HistoriaClinica();
		historia.setAlergias("al paracetamol");
		historia.setHistoriaFamiliar("Paciente con antecedentes de cancer por  abuela materna");
		historia.setNumeroCama(8);
		
		paciente.setHistoriaClinica(historia);
		this.pacienteService.guardarPaciente(paciente);
	}

}
