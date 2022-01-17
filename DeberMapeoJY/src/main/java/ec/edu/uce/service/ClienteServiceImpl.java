package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.repository.IClienteRepo;
@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteRepo.create(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return clienteRepo.read(id);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteRepo.update(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		clienteRepo.delete(id);
	}

}
