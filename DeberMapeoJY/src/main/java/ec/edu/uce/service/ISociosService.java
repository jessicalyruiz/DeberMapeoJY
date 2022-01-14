package ec.edu.uce.service;


import ec.edu.uce.modelo.Socios;

public interface ISociosService {

	public void insertar(Socios socios);
	public Socios buscar(Integer id); 
	public void actualizar(Socios socios); 
	public void eliminar(Integer id); 
}
