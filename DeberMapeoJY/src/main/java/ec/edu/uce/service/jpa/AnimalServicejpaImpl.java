package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Animaljpa;
import ec.edu.uce.repository.IAnimalRepo;
import ec.edu.uce.repository.jpa.IAnimalRepojpa;
import ec.edu.uce.service.IAnimalService;

@Service
public class AnimalServicejpaImpl implements IAnimalServicejpa{

	@Autowired
	private IAnimalRepojpa animalRepo;
	@Override
	public void insertar(Animaljpa animal) {

		animalRepo.create(animal);
	}

	@Override
	public Animaljpa buscar(Integer id) {
		// TODO Auto-generated method stub
		return animalRepo.read(id);
	}

	@Override
	public void actualizar(Animaljpa animal) {
		// TODO Auto-generated method stub
		animalRepo.update(animal);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		animalRepo.delete(id);
	}

	@Override
	public Animaljpa buscarEspecie(String especie) {
		// TODO Auto-generated method stub
		return animalRepo.buscarEspecie(especie);
	}

	@Override
	public Animaljpa buscarEspecieType(String especie) {
		// TODO Auto-generated method stub
		return animalRepo.buscarEspecieType(especie);
	}

	@Override
	public Animaljpa buscarEspecieNamed(String especie) {
		// TODO Auto-generated method stub
		return animalRepo.buscarEspecieNamed(especie);
	}

}
