package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Libro;
import ec.edu.uce.modelo.jpa.Librojpa;
import ec.edu.uce.repository.ILibroRepo;
import ec.edu.uce.repository.jpa.ILibroRepojpa;
import ec.edu.uce.service.ILibroService;
@Service
public class LibroServicejpaImpl implements ILibroServicejpa{

	@Autowired
	private ILibroRepojpa libroRepo;
	
	@Override
	public void insertar(Librojpa libro) {
		// TODO Auto-generated method stub
		libroRepo.create(libro);
	}

	@Override
	public Librojpa buscar(Integer id) {
		// TODO Auto-generated method stub
		return libroRepo.read(id);
	}

	@Override
	public void actualizar(Librojpa libro) {
		// TODO Auto-generated method stub
		libroRepo.update(libro);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		libroRepo.delete(id);
	}

	@Override
	public Librojpa buscarAutor(String autor) {
		// TODO Auto-generated method stub
		return libroRepo.buscarAutor(autor);
	}

	@Override
	public Librojpa buscarAutorNamed(String autor) {
		// TODO Auto-generated method stub
		return libroRepo.buscarAutorNamed(autor);
	}

	@Override
	public Librojpa buscarAutorTyped(String autor) {
		// TODO Auto-generated method stub
		return libroRepo.buscarAutorTyped(autor);
	}

	@Override
	public Librojpa buscarAutorCriteriaAPI(String autor) {
		// TODO Auto-generated method stub
		return libroRepo.buscarAutorCriteriaAPI(autor);
	}

}
