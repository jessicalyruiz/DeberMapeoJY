package ec.edu.uce.service.jpa.relacionadas;

import ec.edu.uce.modelo.jpa.relacionadas.Consumo;
import ec.edu.uce.modelo.jpa.relacionadas.TarjetaCredito;

public interface ITarjetaCreditoService {

	public void create(TarjetaCredito tarjeta);
	public TarjetaCredito read(Integer id); 
	public void update(TarjetaCredito tarjeta); 
	public void delete(Integer id); 
	
	public TarjetaCredito buscarNumeroTarjeta(String numero);
	public void realizarCompra(Consumo consumo,  String numeroTarjeta);
}
