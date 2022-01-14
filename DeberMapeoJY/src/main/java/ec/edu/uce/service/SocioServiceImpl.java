package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Socios;
import ec.edu.uce.repository.ISociosRepo;

@Service
public class SocioServiceImpl implements ISociosService{

	@Autowired
	private  ISociosRepo socioRepo;
	@Override
	public void insertar(Socios socios) {
		// TODO Auto-generated method stub
		socioRepo.create(socios);
	}

	@Override
	public Socios buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Socios socios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
