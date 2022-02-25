package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

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
import ec.edu.uce.modelo.jpa.relacionadas.Consumo;
import ec.edu.uce.modelo.jpa.relacionadas.Estudiante;
import ec.edu.uce.modelo.jpa.relacionadas.HistoriaClinica;
import ec.edu.uce.modelo.jpa.relacionadas.Matricula;
import ec.edu.uce.modelo.jpa.relacionadas.Paciente;
import ec.edu.uce.modelo.jpa.relacionadas.TarjetaCredito;
import ec.edu.uce.repository.jpa.relacionadas.IPacienteRepo;
import ec.edu.uce.service.jpa.IAnimalServicejpa;
import ec.edu.uce.service.jpa.IClienteServicejpa;
import ec.edu.uce.service.jpa.IEmpleadoServicejpa;
import ec.edu.uce.service.jpa.ILibroServicejpa;
import ec.edu.uce.service.jpa.IPlantaServicejpa;
import ec.edu.uce.service.jpa.relacionadas.IConsumoService;
import ec.edu.uce.service.jpa.relacionadas.IEstudianteService;
import ec.edu.uce.service.jpa.relacionadas.IPacienteService;
import ec.edu.uce.service.jpa.relacionadas.ITarjetaCreditoService;



@SpringBootApplication
public class DeberMapeoJyApplication2 implements CommandLineRunner{
	
	private static final Logger LOG= (Logger) LoggerFactory.getLogger(DeberMapeoJyApplication2.class);
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private ITarjetaCreditoService tarjetaService;
	
	@Autowired
	private IConsumoService consumoService;
	
	public static void main(String[] args) {
		SpringApplication.run(DeberMapeoJyApplication2.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		/*
		Estudiante estudiante=new Estudiante();
		estudiante.setApellido("Lincango");
		estudiante.setNombre("Andres");
		estudiante.setCedula("1723420434");
	
		Matricula matricula=new Matricula();
		matricula.setNumero("12-4");
		matricula.setColegiatura(new BigDecimal(50));
		matricula.setEstudiante(estudiante);
		
		estudiante.setMatricula(matricula);
		this.estudianteService.guardarEstudiate(estudiante);
		
		*/
		//segundo ejemplo
		/*
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
		*/
		
		//******************JOIN
		/*
		List<Estudiante> listaEstudianteApellidoJOIN=this.estudianteService.buscarPorApellidoJOIN("Lincango");
		LOG.info("*********JOIN **** Longitud: "+ listaEstudianteApellidoJOIN.size());
		for (Estudiante e : listaEstudianteApellidoJOIN) {
			LOG.info(e.toString());
		}
		
		List<Estudiante> listaEstudianteApellidoLeftJOIN=this.estudianteService.buscarPorApellidoLEFT("Lincango");
		LOG.info("*********LEFT **** Longitud: "+ listaEstudianteApellidoLeftJOIN.size());
		for (Estudiante e : listaEstudianteApellidoLeftJOIN) {
			LOG.info(e.toString());
		}
		
		
		List<Estudiante> listaEstudianteApellidoRightJOIN=this.estudianteService.buscarPorApellidoRIGHT("Lincango");
		LOG.info("*********right **** Longitud: "+ listaEstudianteApellidoRightJOIN.size());
		for (Estudiante e : listaEstudianteApellidoRightJOIN) {
			LOG.info(e.toString());
		}
		
		List<Estudiante> listaEstudianteApellidoWHERE=this.estudianteService.buscarPorApellidoWHERE("Lincango");
		LOG.info("*********WHERE **** Longitud: "+ listaEstudianteApellidoWHERE.size());
		for (Estudiante e : listaEstudianteApellidoWHERE) {
			LOG.info(e.toString());
		}
		*/
		
		//////****************************************
		//tarea 21
		/*
		TarjetaCredito tarjeta=new TarjetaCredito();
		tarjeta.setCedulaPropietario("2300115066");
		tarjeta.setCupo(new BigDecimal(20000));
		tarjeta.setNumero("123-456");
		this.tarjetaService.create(tarjeta);
		
		TarjetaCredito tarjeta2=new TarjetaCredito();
		tarjeta2.setCedulaPropietario("1709782847");
		tarjeta2.setCupo(new BigDecimal(30000));
		tarjeta2.setNumero("789-456");
		this.tarjetaService.create(tarjeta2);
		*/
		
		
		Consumo consumo=new Consumo();
		consumo.setFecha(LocalDateTime.now());
		consumo.setValor(new BigDecimal(10000));
		//realizo compra
		this.tarjetaService.realizarCompra(consumo, "789-456");
		
	}

}
