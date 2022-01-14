package ec.edu.uce.modelo;

public class Animal {

	private String especie;
	private String cuidados;
	private Integer id;
	private String nombre;
	private Integer edad;
	
	//GETTERS Y SETTERS
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getCuidados() {
		return cuidados;
	}
	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", cuidados=" + cuidados + ", id=" + id + ", nombre=" + nombre + ", edad="
				+ edad + "]";
	}
	
	
	
}
