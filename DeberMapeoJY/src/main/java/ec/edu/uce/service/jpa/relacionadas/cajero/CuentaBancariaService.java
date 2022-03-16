package ec.edu.uce.service.jpa.relacionadas.cajero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.relacionadas.cajero.CuentaBancaria;
import ec.edu.uce.repository.jpa.relacionadas.cajero.ICuentaBancariaRepo;

@Service
public class CuentaBancariaService implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepo cuentaRepo;

	@Override
	public void create(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaRepo.create(cuentaBancaria);
	}

	@Override
	public CuentaBancaria read(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.read(id);
	}

	@Override
	public void update(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaRepo.update(cuentaBancaria);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaRepo.delete(id);
	}
}
