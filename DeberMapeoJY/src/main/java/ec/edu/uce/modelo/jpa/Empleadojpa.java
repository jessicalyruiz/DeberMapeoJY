package ec.edu.uce.modelo.jpa;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
@NamedQuery(name = "Empleado.buscarApellido",query = "select e from Empleadojpa e where e.apellido=:valor")
public class Empleadojpa {

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_empleado")
	@SequenceGenerator(name = "seq_empleado", sequenceName = "seq_empleado",allocationSize = 1 )
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "puesto")
	private String puesto;
	
	@Column(name = "fechainicio")
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
