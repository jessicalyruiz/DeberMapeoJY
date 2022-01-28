package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Planta;
import ec.edu.uce.modelo.jpa.Plantajpa;
import ec.edu.uce.repository.IPlantaRepo;
import ec.edu.uce.repository.jpa.IPlantaRepojpa;
import ec.edu.uce.service.IPlantaService;

@Service
public class PlantaServicejpaImpl implements IPlantaServicejpa{

	@Autowired
	private IPlantaRepojpa plantaRepo;
	
	@Override
	public void insertar(Plantajpa planta) {
		// TODO Auto-generated method stub
		plantaRepo.create(planta);
	}

	@Override
	public Plantajpa buscar(Integer id) {
		// TODO Auto-generated method stub
		return plantaRepo.read(id);
	}

	@Override
	public void actualizar(Plantajpa planta) {
		plantaRepo.update(planta);
	}

	@Override
	public void eliminar(Integer id) {
		plantaRepo.delete(id);
	}

	@Override
	public Plantajpa buscarNombreComun(String nombre) {
		// TODO Auto-generated method stub
		return plantaRepo.buscarNombreComun(nombre);
	}

	@Override
	public Plantajpa buscarNombreComunNamed(String nombre) {
		// TODO Auto-generated method stub
		return plantaRepo.buscarNombreComunNamed(nombre);
	}

	@Override
	public Plantajpa buscarNombreComunTyped(String nombre) {
		// TODO Auto-generated method stub
		return plantaRepo.buscarNombreComunTyped(nombre);
	}

	@Override
	public Plantajpa buscarNombreComunCriteriaAPI(String nombre) {
		// TODO Auto-generated method stub
		return plantaRepo.buscarNombreComunCriteriaAPI(nombre);
	}

}
