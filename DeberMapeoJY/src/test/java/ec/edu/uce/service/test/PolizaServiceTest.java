package ec.edu.uce.service.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.modelo.test.PolizaSeguro;
//@Transactional
//@Rollback(true)
@SpringBootTest
class PolizaServiceTest {

	@Autowired 
	private IPolizaService polizaService;
	
	@Test
	void testCreate() {
		//fail("Not yet implemented");
		PolizaSeguro poliza=new PolizaSeguro();
		poliza.setDescripcion("Poliza premium");
		poliza.setEstado("aprobada");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2023, 04, 23, 0, 0));
		poliza.setNumero("455-66");
		poliza.setValor(new BigDecimal(10000));
		this.polizaService.create(poliza);
		
		assertThat(poliza).isNotNull();
	}

	@Test
	void testCreate2() {
		//fail("Not yet implemented");
		PolizaSeguro poliza=new PolizaSeguro();
		poliza.setDescripcion("Poliza premium");
		poliza.setEstado("aprobada");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2023, 04, 23, 0, 0));
		poliza.setNumero("78-85");
		poliza.setValor(new BigDecimal(20000));
		this.polizaService.create(poliza);
		
		assertThat(poliza).isExactlyInstanceOf(PolizaSeguro.class);
	}
	
	@Test
	void testRead() {
		//fail("Not yet implemented");
		PolizaSeguro poliza=new PolizaSeguro();
		poliza.setDescripcion("Poliza basica");
		poliza.setEstado("aprobada");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2023, 04, 23, 0, 0));
		poliza.setNumero("455-66");
		poliza.setValor(new BigDecimal(10000));
		this.polizaService.create(poliza);
		
		PolizaSeguro polizaFind=this.polizaService.read(poliza.getId());
		
		assertThat(polizaFind).isNotNull();
	}
	
	
	@Test
	void testRead2() {
		//fail("Not yet implemented");
		PolizaSeguro poliza=new PolizaSeguro();
		poliza.setDescripcion("Poliza basica");
		poliza.setEstado("aprobada");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2023, 04, 23, 0, 0));
		poliza.setNumero("78-45");
		poliza.setValor(new BigDecimal(80000));
		this.polizaService.create(poliza);
		
		PolizaSeguro polizaFind=this.polizaService.read(poliza.getId());
		
		assertThat(polizaFind).isInstanceOf(PolizaSeguro.class);
	}
	

	@Test
	void testUpdate() {
		//fail("Not yet implemented");
		PolizaSeguro poliza=new PolizaSeguro();
		poliza.setDescripcion("Poliza familiar");
		poliza.setEstado("en curso");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2023, 04, 23, 0, 0));
		poliza.setNumero("145-63");
		poliza.setValor(new BigDecimal(80000));
		this.polizaService.create(poliza);
		
		PolizaSeguro polizaFind=this.polizaService.read(poliza.getId());
		polizaFind.setNumero("1489-759");
		this.polizaService.update(polizaFind);
		assertThat(polizaFind.getId()).isEqualTo(poliza.getId());
	}
	
	@Test
	void testUpdate2() {
		//fail("Not yet implemented");
		PolizaSeguro poliza=new PolizaSeguro();
		poliza.setDescripcion("Poliza Vida");
		poliza.setEstado("en curso");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2024, 04, 23, 0, 0));
		poliza.setNumero("36-89");
		poliza.setValor(new BigDecimal(10000));
		this.polizaService.create(poliza);
		
		poliza.setEstado("en.. curso");
		this.polizaService.update(poliza);
		assertThat(poliza.getId()).isNotNull();
	}
	

	@Test
	void testDelete() {
		//fail("Not yet implemented");
		
		PolizaSeguro poliza=new PolizaSeguro();
		poliza.setDescripcion("Poliza Seguro carro");
		poliza.setEstado("en remision");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2024, 04, 23, 0, 0));
		poliza.setNumero("789-258");
		poliza.setValor(new BigDecimal(10000));
		this.polizaService.create(poliza);
		
		this.polizaService.delete(poliza.getId());
		PolizaSeguro polizaFind=this.polizaService.read(poliza.getId());
		assertThat(polizaFind).isNull();
	}
	
	@Test
	void testDelete2() {
		//fail("Not yet implemented");
		
		PolizaSeguro poliza=new PolizaSeguro();
		poliza.setDescripcion("Poliza Seguro Medico");
		poliza.setEstado("en revision");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2025, 04, 23, 0, 0));
		poliza.setNumero("4398-753");
		poliza.setValor(new BigDecimal(97000));
		this.polizaService.create(poliza);
		
		this.polizaService.delete(poliza.getId());
		assertThat(poliza).isNotNull();
	}

}
