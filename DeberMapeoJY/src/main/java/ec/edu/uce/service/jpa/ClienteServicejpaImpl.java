package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.jpa.Clientejpa;
import ec.edu.uce.repository.IClienteRepo;
import ec.edu.uce.repository.jpa.IClienteRepojpa;
import ec.edu.uce.service.IClienteService;
@Service
public class ClienteServicejpaImpl implements IClienteServicejpa {
	@Autowired
	private IClienteRepojpa clienteRepo;
	
	@Override
	public void insertar(Clientejpa cliente) {
		// TODO Auto-generated method stub
		clienteRepo.create(cliente);
	}

	@Override
	public Clientejpa buscar(Integer id) {
		// TODO Auto-generated method stub
		return clienteRepo.read(id);
	}

	@Override
	public void actualizar(Clientejpa cliente) {
		// TODO Auto-generated method stub
		clienteRepo.update(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		clienteRepo.delete(id);
	}

	@Override
	public Clientejpa buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return clienteRepo.buscarApellido(apellido);
	}

	@Override
	public Clientejpa buscarApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return clienteRepo.buscarApellidoNamed(apellido);
	}

	@Override
	public Clientejpa buscarApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return clienteRepo.buscarApellidoTyped(apellido);
	}

	@Override
	public Clientejpa buscarApellidoNative(String apellido) {
		// TODO Auto-generated method stub
		return clienteRepo.buscarApellidoNative(apellido);
	}

}
