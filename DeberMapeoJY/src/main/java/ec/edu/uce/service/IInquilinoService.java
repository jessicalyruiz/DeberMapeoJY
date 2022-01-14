package ec.edu.uce.service;


import ec.edu.uce.modelo.Inquilino;

public interface IInquilinoService {

	public void insertar(Inquilino inquilino);
	public Inquilino buscar(Integer id); 
	public void actualizar(Inquilino inquilino); 
	public void eliminar(Integer id); 
}
