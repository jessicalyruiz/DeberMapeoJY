package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo productoRepo;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		productoRepo.create(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return productoRepo.read(id);
	}

	@Override
	public void actualizar(Producto producto) {
		productoRepo.update(producto);
	}

	@Override
	public void eliminar(Integer id) {
		productoRepo.delete(id);
	}

}
