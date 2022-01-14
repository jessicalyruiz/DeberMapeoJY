package ec.edu.uce.modelo;

public class Socios {

	private String nombre;
	private String apellido;
	private Integer id;
	private Float aportes;
	private String membresia;
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getAportes() {
		return aportes;
	}
	public void setAportes(Float aportes) {
		this.aportes = aportes;
	}
	public String getMembresia() {
		return membresia;
	}
	public void setMembresia(String membresia) {
		this.membresia = membresia;
	}
	@Override
	public String toString() {
		return "Socios [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", aportes=" + aportes
				+ ", membresia=" + membresia + "]";
	}
	
	
}
