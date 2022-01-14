package ec.edu.uce.service;


import ec.edu.uce.modelo.Producto;

public interface IProductoService {

	public void insertar(Producto producto);
	public Producto buscar(Integer id); 
	public void actualizar(Producto producto); 
	public void eliminar(Integer id); 
}
