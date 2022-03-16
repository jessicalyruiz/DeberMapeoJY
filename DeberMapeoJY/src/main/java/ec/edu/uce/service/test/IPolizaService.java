package ec.edu.uce.service.test;

import ec.edu.uce.modelo.test.PolizaSeguro;

public interface IPolizaService {

	public void create(PolizaSeguro polizaSeguro);
	public PolizaSeguro read(Integer id); 
	public void update(PolizaSeguro polizaSeguro); 
	public void delete(Integer id); 
}
