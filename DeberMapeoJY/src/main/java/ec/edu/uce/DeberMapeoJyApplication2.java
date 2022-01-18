package ec.edu.uce;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		
		
//		animal.setEspecie("conejo");
//		animal.setNombre("bombom");
//		animal.setEdad(1);
//		animal.setCuidados("darle agua" );
//		animalService.insertar(animal);
//		
		
		
//		Animaljpa animal2=new Animaljpa();
//		animal.setId(4);
//		animal2.setEspecie("conejo");
//		animal2.setNombre("piki");
//		animal2.setEdad(1);
//		animal2.setCuidados("evitar banio" );
//		animalService.actualizar(animal2);
		
		
		
		
//		Clientejpa cliente= new Clientejpa();
//		cliente.setApellido("Yanez ruiz");
//		cliente.setNombre("JJessica");
//		cliente.setDireccion("via Quevedo");
//		cliente.setEmail("jlyanez@uce.edu.ec");
//		cliente.setId(230011);
//		//clienteService.insertar(cliente);
//		clienteService.actualizar(cliente);
		
		
		
//		Empleadojpa empleado=new Empleadojpa();
//		empleado.setApellido("vivanco");
//		empleado.setNombre("Andres");
//		//empleado.setId(1700);
//		empleado.setPuesto("gerente");
//		empleado.setFechaInicio( LocalDate.of(2018, Month.JUNE, 24));
//		empleadoService.insertar(empleado);
//		
//		//empleadoService.actualizar(empleado);
		
		
		
		
		
//		Librojpa libro= new Librojpa();
//		libro.setAutor("Zusak");
//		libro.setCantidad(70);
//		//libro.setIsbn(789456123);
//		libro.setSinopsis("cuenta la historia de una niña alemana, Liesel, a quien sus padres dejan en adopción antes de huir de la Alemania nazi tiempo antes de la Segunda Guerra Mundial");
//		libro.setTitulo("La ladrona de libros");
//		libroService.insertar(libro);
//		
////		libroService.actualizar(libro);
//		
		
		
		
		Plantajpa planta = new Plantajpa();
		planta.setId(15);
		planta.setNombreCientifico("Euphorbiaceae");
		planta.setNombreComun("Corona de cristo");
		planta.setEdad("2 anios");
		planta.setCuidados("poco riego y mucha luz");
		//plantaService.insertar(planta);
		plantaService.actualizar(planta);
		
	
	}

}
