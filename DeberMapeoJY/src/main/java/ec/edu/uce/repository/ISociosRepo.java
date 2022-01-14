package ec.edu.uce.repository;


import ec.edu.uce.modelo.Socios;

public interface ISociosRepo {

	public void create(Socios socios);
	public Socios read(Integer id); 
	public void update(Socios socios); 
	public void delete(Integer id); 
}
