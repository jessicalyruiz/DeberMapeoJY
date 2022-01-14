package ec.edu.uce.modelo;

public class Inquilino {

	private String nombre;
	private String apellido;
	private Integer id;
	private Integer numDept;
	private Integer numMedidor;
	private Float renta;
	
	
	//getters and setters 
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
	public Integer getNumDept() {
		return numDept;
	}
	public void setNumDept(Integer numDept) {
		this.numDept = numDept;
	}
	public Integer getNumMedidor() {
		return numMedidor;
	}
	public void setNumMedidor(Integer numMedidor) {
		this.numMedidor = numMedidor;
	}
	public Float getRenta() {
		return renta;
	}
	public void setRenta(Float renta) {
		this.renta = renta;
	}
	@Override
	public String toString() {
		return "Inquilino [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", numDept=" + numDept
				+ ", numMedidor=" + numMedidor + ", renta=" + renta + "]";
	}
	
	
}
