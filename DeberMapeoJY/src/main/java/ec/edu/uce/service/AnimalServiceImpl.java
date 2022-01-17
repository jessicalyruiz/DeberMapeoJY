package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.repository.IAnimalRepo;

@Service
public class AnimalServiceImpl implements IAnimalService{

	@Autowired
	private IAnimalRepo animalRepo;
	@Override
	public void insertar(Animal animal) {
		// TODO Auto-generated method stub
		animalRepo.create(animal);
	}

	@Override
	public Animal buscar(Integer id) {
		// TODO Auto-generated method stub
		return animalRepo.read(id);
	}

	@Override
	public void actualizar(Animal animal) {
		// TODO Auto-generated method stub
		animalRepo.update(animal);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		animalRepo.delete(id);
	}

}
