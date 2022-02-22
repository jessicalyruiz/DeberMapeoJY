package ec.edu.uce.repository.jpa.relacionadas;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.relacionadas.Consumo;

public interface IConsumoRepo {
	public void create(Consumo consumo);
	public Consumo read(Integer id); 
	public void update(Consumo consumo); 
	public void delete(Integer id); 
	
	public Consumo buscarValorConsumo(BigDecimal valor); 
}
