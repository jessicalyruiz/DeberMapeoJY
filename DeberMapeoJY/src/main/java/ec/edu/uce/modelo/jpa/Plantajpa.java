package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "planta")
@NamedQuery(name = "Planta.buscarNombreComunNamed",query = "select p from Plantajpa p where p.nombreComun=:valor")
public class Plantajpa {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_planta")
	@SequenceGenerator(name = "seq_planta", sequenceName = "seq_planta",allocationSize = 1 )
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombrecomun")
	private String nombreComun;
	
	@Column(name = "nombrecientifico")
	private String nombreCientifico;
	
	@Column(name = "cuidados")
	private String cuidados;
	
	@Column(name = "edad")
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
