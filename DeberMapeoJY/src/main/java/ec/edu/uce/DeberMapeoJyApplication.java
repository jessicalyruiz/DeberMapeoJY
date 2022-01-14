package ec.edu.uce;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Empleado;
import ec.edu.uce.modelo.Inquilino;
import ec.edu.uce.modelo.Libro;
import ec.edu.uce.modelo.NinioGuarderia;
import ec.edu.uce.modelo.Pelicula;
import ec.edu.uce.modelo.Planta;
import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.Socios;
import ec.edu.uce.service.IAnimalService;
import ec.edu.uce.service.IClienteService;
import ec.edu.uce.service.IEmpleadoService;
import ec.edu.uce.service.IInquilinoService;
import ec.edu.uce.service.ILibroService;
import ec.edu.uce.service.IPeliculaService;
import ec.edu.uce.service.IPlantaService;
import ec.edu.uce.service.IProductoService;
import ec.edu.uce.service.ISociosService;
import ec.edu.uce.service.NinioGuarderiaServiceImpl;

@SpringBootApplication
public class DeberMapeoJyApplication implements CommandLineRunner{
	
	@Autowired
	private IAnimalService animalService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IInquilinoService inquilinoService;
	
	@Autowired
	private ILibroService libroService;
	
	@Autowired
	private NinioGuarderiaServiceImpl ninioService;
	
	@Autowired
	private IPeliculaService peliService;
	
	@Autowired
	private IPlantaService plantaService;
	@Autowired
	private IProductoService productoService;
	@Autowired
	private ISociosService socioService;
	
	public static void main(String[] args) {
		SpringApplication.run(DeberMapeoJyApplication.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		/*
		Animal animal=new Animal();
		animal.setId(1);
		animal.setEspecie("perro");
		animal.setNombre("Blaze");
		animal.setEdad(4);
		animal.setCuidados("darle amor sin medida" );
		animalService.insertar(animal);
		*/
		/*
		Cliente cliente= new Cliente();
		cliente.setApellido("yanez");
		cliente.setNombre("JEssi");
		cliente.setDireccion("villa florida");
		cliente.setEmail("jlyanez@uce.edu.ec");
		cliente.setId(230011);
		clienteService.insertar(cliente);
		*/
		
		/*
		Empleado empleado=new Empleado();
		empleado.setApellido("Lincango");
		empleado.setNombre("Pedro");
		empleado.setId(1700);
		empleado.setPuesto("gerente");
		empleado.setFechaInicio( LocalDate.of(2014, Month.JANUARY, 1));
		empleadoService.insertar(empleado);
		System.out.println(empleado.getFechaInicio());*/
		
		/*
		Inquilino inquilino=new Inquilino();
		inquilino.setNombre("Taty");
		inquilino.setApellido("Ruiz");
		inquilino.setId(123);
		inquilino.setNumDept(5);
		inquilino.setNumMedidor(7878);
		inquilino.setRenta(800.5f);
		inquilinoService.insertar(inquilino);
		*/
		/*
		Libro libro= new Libro();
		libro.setAutor("Lewis Carroll");
		libro.setCantidad(20);
		libro.setIsbn(789456123);
		libro.setSinopsis("La historia cuenta cómo una niña llamada Alicia cae por un agujero, encontrándose en un mundo peculiar y extraño , poblado por humanos y criaturas antropomórficas. El libro juega con la lógica, dando a la novela gran popularidad tanto en niños como en adultos");
		libro.setTitulo("Alicia en el pais de las maravillas");
		libroService.insertar(libro);
		*/
		/*
		NinioGuarderia ninio=new NinioGuarderia();
		ninio.setNombre("Blaze");
		ninio.setApellido("Sisalima");
		ninio.setId(1);
		ninio.setAlergias("chocolate, lentejas");
		ninio.setPadres("Jessi y Andres");
		ninioService.insertar(ninio);
		*/
		
		/*
		Pelicula peli=new Pelicula();
		peli.setActorPrincipal("cris evans");
		peli.setTitulo("Capitan America");
		peli.setVecesVista(100);
		peli.setSinopsis("peli de avengers, un hombre escualido pero con buenos principios se convierte en super hombre");
		peli.setCodigo(1);
		peliService.insertar(peli);
		*/
		
		/*
		Planta planta = new Planta();
		planta.setId(1);
		planta.setNombreCientifico("echeveria perle");
		planta.setNombreComun("suculenta");
		planta.setEdad("2 meses");
		planta.setCuidados("poco riego y mucha luz");
		plantaService.insertar(planta);
		*/
		/*
		Producto producto =new Producto();
		producto.setCantidad(500);
		producto.setCodigo(122);
		producto.setFechaElaboracion(LocalDate.of(2021, Month.JANUARY, 18));
		producto.setFechaVencimiento(LocalDate.of(2021, Month.MAY, 18));
		producto.setNombre("Facundo");
		productoService.insertar(producto);
		*/
		
		Socios socio=new Socios();
		socio.setApellido("Vicanco");
		socio.setNombre("Andres");
		socio.setAportes(457.8f);
		socio.setId(789);
		socio.setMembresia("gold");
		socioService.insertar(socio);
		
	}

}
