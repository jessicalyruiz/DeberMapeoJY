package ec.edu.uce.repository.jpa;



import ec.edu.uce.modelo.jpa.Librojpa;

public interface ILibroRepojpa {

	public void create(Librojpa libro);
	public Librojpa read(Integer id); 
	public void update(Librojpa libro); 
	public void delete(Integer id); 
	public Librojpa buscarAutor(String autor);
	public Librojpa buscarAutorNamed(String autor);
	public Librojpa buscarAutorTyped(String autor);
	public Librojpa buscarAutorNative(String autor);
}
