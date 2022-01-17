package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Planta;
import ec.edu.uce.repository.IPlantaRepo;

@Service
public class PlantaServiceImpl implements IPlantaService{

	@Autowired
	private IPlantaRepo plantaRepo;
	
	@Override
	public void insertar(Planta planta) {
		// TODO Auto-generated method stub
		plantaRepo.create(planta);
	}

	@Override
	public Planta buscar(Integer id) {
		// TODO Auto-generated method stub
		return plantaRepo.read(id);
	}

	@Override
	public void actualizar(Planta planta) {
		plantaRepo.update(planta);
	}

	@Override
	public void eliminar(Integer id) {
		plantaRepo.delete(id);
	}

}
