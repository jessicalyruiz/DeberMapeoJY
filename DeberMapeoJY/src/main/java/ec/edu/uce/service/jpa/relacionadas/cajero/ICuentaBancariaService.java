package ec.edu.uce.service.jpa.relacionadas.cajero;

import ec.edu.uce.modelo.jpa.relacionadas.cajero.CuentaBancaria;

public interface ICuentaBancariaService {

	public void create(CuentaBancaria cuentaBancaria);
	public CuentaBancaria read(Integer id); 
	public void update(CuentaBancaria cuentaBancaria); 
	public void delete(Integer id); 
}
