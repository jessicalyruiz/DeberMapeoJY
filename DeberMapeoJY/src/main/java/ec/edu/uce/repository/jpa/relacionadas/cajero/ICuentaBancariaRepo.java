package ec.edu.uce.repository.jpa.relacionadas.cajero;

import ec.edu.uce.modelo.jpa.relacionadas.cajero.CuentaBancaria;

public interface ICuentaBancariaRepo {

	public void create(CuentaBancaria cuentaBancaria);
	public CuentaBancaria read(Integer id); 
	public void update(CuentaBancaria cuentaBancaria); 
	public void delete(Integer id); 
}
