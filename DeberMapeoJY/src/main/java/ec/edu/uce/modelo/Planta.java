package ec.edu.uce.modelo;

public class Planta {

	private String nombreComun;
	private String nombreCientifico;
	private Integer id;
	private String cuidados;
	private String edad;
	
	//getters y setters
	public String getNombreComun() {
		return nombreComun;
	}
	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCuidados() {
		return cuidados;
	}
	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Planta [nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico + ", id=" + id
				+ ", cuidados=" + cuidados + ", edad=" + edad + "]";
	}
	
	
}
