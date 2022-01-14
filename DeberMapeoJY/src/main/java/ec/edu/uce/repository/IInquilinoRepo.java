package ec.edu.uce.repository;


import ec.edu.uce.modelo.Inquilino;

public interface IInquilinoRepo {

	public void create(Inquilino inquilino);
	public Inquilino read(Integer id); 
	public void update(Inquilino inquilino); 
	public void delete(Integer id); 
}
