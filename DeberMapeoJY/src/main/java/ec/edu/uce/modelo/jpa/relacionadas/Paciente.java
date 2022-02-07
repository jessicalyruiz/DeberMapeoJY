package ec.edu.uce.modelo.jpa.relacionadas;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paciente2")
	@SequenceGenerator(name = "seq_paciente2", sequenceName = "seq_paciente2", allocationSize = 1)
	@Column(name = "paci_id")
	private Integer id;

	@Column(name = "paci_nombre")
	private String Nombre;

	@Column(name = "paci_apellido")
	private String apellido;

	@Column(name = "paci_cedula")
	private String cedula;

	@Column(name = "paci_edad")
	private String edad;

	@OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
	private HistoriaClinica historiaClinica;

	// GET AND SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

}
