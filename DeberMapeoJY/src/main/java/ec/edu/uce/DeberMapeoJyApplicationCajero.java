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

import ec.edu.uce.modelo.jpa.relacionadas.cajero.CuentaBancaria;
import ec.edu.uce.modelo.jpa.relacionadas.cajero.CuentaHabiente;
import ec.edu.uce.service.jpa.relacionadas.cajero.ICuentaBancariaService;
import ec.edu.uce.service.jpa.relacionadas.cajero.ICuentaHabienteService;
import ec.edu.uce.service.jpa.relacionadas.cajero.IHistoricoRetitoService;




@SpringBootApplication
public class DeberMapeoJyApplicationCajero implements CommandLineRunner{
	
	private static final Logger LOG= (Logger) LoggerFactory.getLogger(DeberMapeoJyApplicationCajero.class);
	
	@Autowired
	private ICuentaHabienteService cuantaHabienteService;
	
	@Autowired
	private ICuentaBancariaService cuentaService;
	
	@Autowired
	private IHistoricoRetitoService retiroService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DeberMapeoJyApplicationCajero.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		//Insertar desde la clase principal 2Cuenta Habientes con una CuentaBancaria cada uno
		CuentaHabiente cliente=new CuentaHabiente();
		cliente.setApellido("Ruiz");
		cliente.setCedula("1708");
		cliente.setNombre("Jessica");
		
		CuentaHabiente cliente2=new CuentaHabiente();
		cliente2.setApellido("Lincango");
		cliente2.setCedula("17892");
		cliente2.setNombre("Andres");
		
		CuentaBancaria cuenta=new CuentaBancaria();
		cuenta.setNumero("78-96");
		cuenta.setSaldo(new BigDecimal(1000));
		cuenta.setTipo("Corriente");
		cuenta.setCuentaHabiente(cliente);
		
		CuentaBancaria cuenta2=new CuentaBancaria();
		cuenta2.setNumero("36-45");
		cuenta2.setSaldo(new BigDecimal(2000));
		cuenta2.setTipo("Ahorro");
		cuenta2.setCuentaHabiente(cliente2);
		
		List<CuentaBancaria> cuentasCliente=new ArrayList<>();
		cuentasCliente.add(cuenta);
		cliente.setCuentas(cuentasCliente);
		
		List<CuentaBancaria> cuentasCliente2=new ArrayList<>();
		cuentasCliente.add(cuenta2);
		cliente2.setCuentas(cuentasCliente2);
		
		//cuantaHabienteService.create(cliente);
		//cuantaHabienteService.create(cliente2);
		
		
	}

}
