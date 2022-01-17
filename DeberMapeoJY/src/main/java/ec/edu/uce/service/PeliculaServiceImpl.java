package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Pelicula;
import ec.edu.uce.repository.IPeliculaRepo;
@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	private IPeliculaRepo peliRepo;
	@Override
	public void insertar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		peliRepo.create(pelicula);
	}

	@Override
	public Pelicula buscar(Integer id) {
		// TODO Auto-generated method stub
		return peliRepo.read(id);
	}

	@Override
	public void actualizar(Pelicula pelicula) {
		peliRepo.update(pelicula);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		peliRepo.delete(id);
	}

}
