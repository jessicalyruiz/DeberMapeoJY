package ec.edu.uce.modelo;

public class NinioGuarderia {

	private String nombre;
	private String apellido;
	private Integer id;
	private String alergias;
	private String padres;
	
	//getters  y setters
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
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getPadres() {
		return padres;
	}
	public void setPadres(String padres) {
		this.padres = padres;
	}
	@Override
	public String toString() {
		return "NinioGuarderia [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", alergias=" + alergias
				+ ", padres=" + padres + "]";
	}
	
	
}
