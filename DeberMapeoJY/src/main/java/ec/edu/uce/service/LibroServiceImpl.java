package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Libro;
import ec.edu.uce.repository.ILibroRepo;
@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroRepo libroService;
	
	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		libroService.create(libro);
	}

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return libroService.read(id);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		libroService.update(libro);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		libroService.delete(id);
	}

}
