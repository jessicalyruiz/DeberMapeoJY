package ec.edu.uce.service.jpa.relacionadas;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.relacionadas.Consumo;
import ec.edu.uce.repository.jpa.relacionadas.IConsumoRepo;

@Service
public class ConsumoService implements IConsumoService{

	@Autowired
	private IConsumoRepo consumoRepo;
	
	@Override
	public void create(Consumo consumo) {
		// TODO Auto-generated method stub
		this.consumoRepo.create(consumo);
	}

	@Override
	public Consumo read(Integer id) {
		// TODO Auto-generated method stub
		return this.consumoRepo.read(id);
	}

	@Override
	public void update(Consumo consumo) {
		// TODO Auto-generated method stub
		this.consumoRepo.update(consumo);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.consumoRepo.delete(id);
	}

	@Override
	public Consumo buscarValorConsumo(BigDecimal valor) {
		// TODO Auto-generated method stub
		return this.consumoRepo.buscarValorConsumo(valor);
	}

}
