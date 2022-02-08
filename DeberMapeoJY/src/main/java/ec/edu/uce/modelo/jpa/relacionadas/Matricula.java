package ec.edu.uce.modelo.jpa.relacionadas;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_matricula")
	@SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula",allocationSize = 1 )
	@Column(name = "matr_id")
	private Integer id;
	
	@Column(name = "matr_numero")
	private String numero;
	
	@Column(name = "matr_colegiatura")
	private BigDecimal colegiatura;
	
	//clave foranea
	@OneToOne
	@JoinColumn(name = "matr_fk_estudiente") // @JoinColumn, la cual nos permite establecer como se llamará la columna para realizar el JOIN
	private Estudiante estudiante;

	
	//GET AND SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getColegiatura() {
		return colegiatura;
	}

	public void setColegiatura(BigDecimal colegiatura) {
		this.colegiatura = colegiatura;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", numero=" + numero + ", colegiatura=" + colegiatura +  "]";
	}

	
	
	
}
