package ec.edu.uce.modelo;

import java.sql.Date;
import java.time.LocalDate;

public class Empleado {

	private String nombre;
	private String apellido;
	private Integer id;
	private String puesto;
	private LocalDate fechaInicio;
	
	
	//GETTERS AND SETTERS
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
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate localDate) {
		this.fechaInicio = localDate;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", puesto=" + puesto
				+ ", fechaInicio=" + fechaInicio + "]";
	}
	
	
}
