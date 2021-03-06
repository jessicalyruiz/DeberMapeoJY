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
		
		Animal animal=new Animal();
		/*
		animal.setId(1);
		animal.setEspecie("perro");
		animal.setNombre("Blaze");
		animal.setEdad(4);
		animal.setCuidados("darle amor sin medida" );
		animalService.insertar(animal);
		animal.setId(2);
		animal.setEspecie("perro");
		animal.setNombre("Tommy");
		animal.setEdad(2);
		animal.setCuidados("jugar con el" );
		animalService.insertar(animal);*/
		//animalService.actualizar(animal);
		//animalService.eliminar(3);
		
		
		/*
		Cliente cliente= new Cliente();
		cliente.setApellido("yanez");
		cliente.setNombre("JEssi");
		cliente.setDireccion("villa florida");
		cliente.setEmail("jlyanez@uce.edu.ec");
		cliente.setId(230011);
		clienteService.insertar(cliente);
		
		*/
		//clienteService.actualizar(cliente);
		//clienteService.eliminar(2);
		
		/*
		Empleado empleado=new Empleado();
		empleado.setApellido("Lincango");
		empleado.setNombre("Pedro");
		empleado.setId(1700);
		empleado.setPuesto("gerente");
		empleado.setFechaInicio( LocalDate.of(2014, Month.JANUARY, 1));
		empleadoService.insertar(empleado);
		System.out.println(empleado.getFechaInicio());*/
		//empleadoService.actualizar(empleado);
		//empleadoService.eliminar(2);
		
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
//		inquilinoService.actualizar(inquilino);
//		inquilinoService.eliminar(2);
		
		/*
		Libro libro= new Libro();
		libro.setAutor("Lewis Carroll");
		libro.setCantidad(20);
		libro.setIsbn(789456123);
		libro.setSinopsis("La historia cuenta c??mo una ni??a llamada Alicia cae por un agujero, encontr??ndose en un mundo peculiar y extra??o , poblado por humanos y criaturas antropom??rficas. El libro juega con la l??gica, dando a la novela gran popularidad tanto en ni??os como en adultos");
		libro.setTitulo("Alicia en el pais de las maravillas");
		libroService.insertar(libro);
		*/
//		libroService.actualizar(libro);
//		libroService.eliminar(2);
		
		/*
		NinioGuarderia ninio=new NinioGuarderia();
		ninio.setNombre("Blaze");
		ninio.setApellido("Sisalima");
		ninio.setId(1);
		ninio.setAlergias("chocolate, lentejas");
		ninio.setPadres("Jessi y Andres");
		ninioService.insertar(ninio);
		*/
//		ninioService.actualizar(ninio);
//		ninioService.eliminar(2);
		
		
		/*
		Pelicula peli=new Pelicula();
		peli.setActorPrincipal("cris evans");
		peli.setTitulo("Capitan America");
		peli.setVecesVista(100);
		peli.setSinopsis("peli de avengers, un hombre escualido pero con buenos principios se convierte en super hombre");
		peli.setCodigo(1);
		peliService.insertar(peli);
		*/
//		peliService.actualizar(peli);
//		peliService.eliminar(2);
		
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
//		productoService.actualizar(producto);
//		productoService.eliminar(2);
		
		/*
		Socios socio=new Socios();
		socio.setApellido("Vicanco");
		socio.setNombre("Andres");
		socio.setAportes(457.8f);
		socio.setId(789);
		socio.setMembresia("gold");
		socioService.insertar(socio);
		*/
//		socioService.actualizar(socio);
//		socioService.eliminar(2);
	}

}
