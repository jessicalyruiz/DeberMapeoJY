package ec.edu.uce.repository.jpa.relacionadas;


import ec.edu.uce.modelo.jpa.relacionadas.TarjetaCredito;

public interface ITarjetaCreditoRepo {

	public void create(TarjetaCredito tarjeta);
	public TarjetaCredito read(Integer id); 
	public void update(TarjetaCredito tarjeta); 
	public void delete(Integer id); 
	
	public TarjetaCredito buscarNumeroTarjeta(String numero);
	
	public void actualizar(TarjetaCredito tarjeta);
}
