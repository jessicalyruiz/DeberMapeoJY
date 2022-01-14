package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.NinioGuarderia;
import ec.edu.uce.repository.INinioGuarderiaRepo;
@Service
public class NinioGuarderiaServiceImpl implements INinioGuarderia{

	@Autowired
	private INinioGuarderiaRepo ninioRepo;
	@Override
	public void insertar(NinioGuarderia ninioGuarderia) {
		// TODO Auto-generated method stub
		ninioRepo.create(ninioGuarderia);
	}

	@Override
	public NinioGuarderia buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(NinioGuarderia ninioGuarderia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
