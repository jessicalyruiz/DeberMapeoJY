package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Inquilino;
import ec.edu.uce.repository.IInquilinoRepo;
@Service
public class InquilinoServiceImpl implements IInquilinoService{

	@Autowired
	private IInquilinoRepo inquilinoRepo;
	
	@Override
	public void insertar(Inquilino inquilino) {
		// TODO Auto-generated method stub
	inquilinoRepo.create(inquilino);	
	}

	@Override
	public Inquilino buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Inquilino inquilino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
