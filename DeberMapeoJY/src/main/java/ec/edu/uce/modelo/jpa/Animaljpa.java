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
@Table(name = "animal")
@NamedQuery(name = "Animal.buscarEspecieNamed",query = "Select a from Animaljpa a where a.especie=:valor")
public class Animaljpa {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_animal")
	@SequenceGenerator(name = "seq_animal", sequenceName = "seq_animal",allocationSize = 1 )
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "especie")
	private String especie;
	
	@Column(name = "cuidados")
	private String cuidados;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "edad")
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
