package ec.edu.uce.service.jpa.relacionadas;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.relacionadas.Consumo;
import ec.edu.uce.modelo.jpa.relacionadas.TarjetaCredito;
import ec.edu.uce.repository.jpa.relacionadas.ITarjetaCreditoRepo;

@Service
public class TarjetaCreditoServiceImpl implements ITarjetaCreditoService {

	@Autowired
	private ITarjetaCreditoRepo tarjetaRepo;
	@Autowired
	private IConsumoService consumoService;

	@Override
	public void create(TarjetaCredito tarjeta) {
		// TODO Auto-generated method stub
		this.tarjetaRepo.create(tarjeta);
	}

	@Override
	public TarjetaCredito read(Integer id) {
		// TODO Auto-generated method stub
		return this.tarjetaRepo.read(id);
	}

	@Override
	public void update(TarjetaCredito tarjeta) {
		// TODO Auto-generated method stub
		this.tarjetaRepo.update(tarjeta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.tarjetaRepo.delete(id);
	}

	@Override
	@Transactional
	public void realizarCompra(Consumo consumo, String numeroTarjeta) {
		// TODO Auto-generated method stub
		List<Consumo> consumos=new ArrayList<>();
		consumos.add(consumo);
		TarjetaCredito tarjeta=this.buscarNumeroTarjeta(numeroTarjeta);
		consumo.setTarjeta(tarjeta);
		tarjeta.setConsumos(consumos);
		
		//error
		tarjeta.setCedulaPropietario(null);
		
		//inserto consumo
		this.consumoService.create(consumo);
		//actualizo cupo
		tarjeta.setCupo(tarjeta.getCupo().subtract(consumo.getValor()));
		
		this.tarjetaRepo.update(tarjeta);
		
	}

	@Override
	public TarjetaCredito buscarNumeroTarjeta(String numero) {
		// TODO Auto-generated method stub
		return this.tarjetaRepo.buscarNumeroTarjeta(numero);
	}
}
