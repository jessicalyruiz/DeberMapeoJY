package ec.edu.uce.service.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.test.PolizaSeguro;
import ec.edu.uce.repository.test.IPolizaRepo;

@Service
public class PolizaService implements IPolizaService{

	@Autowired
	IPolizaRepo polizaRepo;
	
	@Override
	public void create(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
	this.polizaRepo.create(polizaSeguro);	
	}

	@Override
	public PolizaSeguro read(Integer id) {
		// TODO Auto-generated method stub
		return this.polizaRepo.read(id);
	}

	@Override
	public void update(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.polizaRepo.update(polizaSeguro);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.polizaRepo.delete(id);
	}

	
}
