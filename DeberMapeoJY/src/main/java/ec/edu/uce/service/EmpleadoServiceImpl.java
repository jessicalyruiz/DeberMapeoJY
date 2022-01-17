package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Empleado;
import ec.edu.uce.repository.IEmpleadoRepo;
@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	@Autowired
	private IEmpleadoRepo empleadoRepo;
	
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepo.create(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return empleadoRepo.read(id);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepo.update(empleado);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		empleadoRepo.delete(id);
	}

}
