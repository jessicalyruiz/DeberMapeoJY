package ec.edu.uce;

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
import ec.edu.uce.service.jpa.IAnimalServicejpa;
import ec.edu.uce.service.jpa.IClienteServicejpa;
import ec.edu.uce.service.jpa.IEmpleadoServicejpa;
import ec.edu.uce.service.jpa.ILibroServicejpa;
import ec.edu.uce.service.jpa.IPlantaServicejpa;



@SpringBootApplication
public class DeberMapeoJyApplication2 implements CommandLineRunner{
	
	private static final Logger LOG= (Logger) LoggerFactory.getLogger(DeberMapeoJyApplication2.class);
	@Autowired
	private IAnimalServicejpa animalService;
	@Autowired
	private IClienteServicejpa clienteService;
	@Autowired
	private IEmpleadoServicejpa empleadoService;
	
	
	
	@Autowired
	private ILibroServicejpa libroService;
	
	
	
	@Autowired
	private IPlantaServicejpa plantaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DeberMapeoJyApplication2.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		
		Animaljpa animal=new Animaljpa();
		
		/*
		animal.setEspecie("gato");
		animal.setNombre("kitty");
		animal.setEdad(1);
		animal.setCuidados("nada" );
		animalService.insertar(animal);
		animalService.eliminar(8);
		animalService.eliminar(9);
		animalService.eliminar(7);
		animalService.eliminar(5);
		Animaljpa animalEspecie=animalService.buscarEspecie("gato");
		Animaljpa animalB=animalService.buscar(1);
		System.out.println("*******Animales");
		System.out.println(animalEspecie.toString());
		System.out.println(animalB.toString());
		*/
		LOG.info(animalService.buscarEspecieType("gato").toString());
		LOG.info(animalService.buscarEspecieNamed("gato").toString());
//		Animaljpa animal2=new Animaljpa();
//		animal.setId(4);
//		animal2.setEspecie("conejo");
//		animal2.setNombre("piki");
//		animal2.setEdad(1);
//		animal2.setCuidados("evitar banio" );
//		animalService.actualizar(animal2);
		
		LOG.info(clienteService.buscarApellidoNamed("ruiz").toString());
		LOG.info(clienteService.buscarApellidoTyped("ruiz").toString());
		/*
		
		Clientejpa cliente= new Clientejpa();
		cliente.setApellido("Yanez ruiz");
		cliente.setNombre("Jessica");
		cliente.setDireccion("via Quevedo");
		cliente.setEmail("jlyanez@uce.edu.ec");
		
		//clienteService.insertar(cliente);
		//clienteService.actualizar(cliente);
		
		Clientejpa clienteApellido=clienteService.buscarApellido("ruiz");
		Clientejpa cliente3=clienteService.buscar(4);
		//clienteService.eliminar(8);
		System.out.println(cliente3.toString());
		System.out.println(clienteApellido.toString());
		
		*/
		
		/*
		Empleadojpa empleado=new Empleadojpa();
		empleado.setApellido("vivanco");
		empleado.setNombre("Andres");
		//empleado.setId(1700);
		empleado.setPuesto("gerente");
		empleado.setFechaInicio( LocalDate.of(2018, Month.JUNE, 24));
		empleadoService.insertar(empleado);
		
		//empleadoService.actualizar(empleado);
		empleadoService.eliminar(2);
		System.out.println(empleadoService.buscar(10).toString());
		System.out.println(empleadoService.buscarApellido("Lincango"));
		*/
		LOG.info(empleadoService.buscarApellidoNamed("Lincango").toString());
		LOG.info(empleadoService.buscarApellidoTyped("Lincango").toString());
		/*
		Librojpa libro= new Librojpa();
		libro.setAutor("hhh");
		libro.setCantidad(70);
		//libro.setIsbn(789456123);
		libro.setSinopsis("cuenta la historia de una niña alemana, Liesel, a quien sus padres dejan en adopción antes de huir de la Alemania nazi tiempo antes de la Segunda Guerra Mundial");
		libro.setTitulo("La ladrona de libros");
		libroService.insertar(libro);
		
//		libroService.actualizar(libro);
		System.out.println(libroService.buscar(1).toString());
		System.out.println(libroService.buscarAutor("Zusak").toString());
		libroService.eliminar(1);
		*/
		
		LOG.info(libroService.buscarAutorNamed("Zusak").toString());
		LOG.info(libroService.buscarAutorTyped("Zusak").toString());
		/*
		Plantajpa planta = new Plantajpa();
		
		planta.setNombreCientifico("Euphorbiaceae");
		planta.setNombreComun("Corona de cristo");
		planta.setEdad("2 anios");
		planta.setCuidados("poco riego y mucha luz");
		plantaService.insertar(planta);
		//plantaService.actualizar(planta);
		//plantaService.eliminar(1);
		System.out.println(plantaService.buscar(1).toString());
		System.out.println(plantaService.buscarNombreComun("rosa").toString());
		*/
		LOG.info(plantaService.buscarNombreComunNamed("rosa").toString());
		LOG.info(plantaService.buscarNombreComunTyped("rosa").toString());
	
	}

}
