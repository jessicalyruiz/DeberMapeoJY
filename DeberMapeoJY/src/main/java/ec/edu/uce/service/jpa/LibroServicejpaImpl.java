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
	private ILibroRepojpa libroService;
	
	@Override
	public void insertar(Librojpa libro) {
		// TODO Auto-generated method stub
		libroService.create(libro);
	}

	@Override
	public Librojpa buscar(Integer id) {
		// TODO Auto-generated method stub
		return libroService.read(id);
	}

	@Override
	public void actualizar(Librojpa libro) {
		// TODO Auto-generated method stub
		libroService.update(libro);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		libroService.delete(id);
	}

}
