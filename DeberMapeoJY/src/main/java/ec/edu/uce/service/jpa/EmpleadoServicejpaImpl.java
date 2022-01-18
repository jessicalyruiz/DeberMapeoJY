package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Empleado;
import ec.edu.uce.modelo.jpa.Empleadojpa;
import ec.edu.uce.repository.IEmpleadoRepo;
import ec.edu.uce.repository.jpa.IEmpleadoRepojpa;
import ec.edu.uce.service.IEmpleadoService;
@Service
public class EmpleadoServicejpaImpl implements IEmpleadoServicejpa{
	@Autowired
	private IEmpleadoRepojpa empleadoRepo;
	
	@Override
	public void insertar(Empleadojpa empleado) {
		// TODO Auto-generated method stub
		empleadoRepo.create(empleado);
	}

	@Override
	public Empleadojpa buscar(Integer id) {
		// TODO Auto-generated method stub
		return empleadoRepo.read(id);
	}

	@Override
	public void actualizar(Empleadojpa empleado) {
		// TODO Auto-generated method stub
		empleadoRepo.update(empleado);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		empleadoRepo.delete(id);
	}

}
