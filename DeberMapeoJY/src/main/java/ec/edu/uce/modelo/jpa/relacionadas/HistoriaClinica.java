package ec.edu.uce.modelo.jpa.relacionadas;

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
@Table(name = "historia")
public class HistoriaClinica {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_historia")
	@SequenceGenerator(name = "seq_historia", sequenceName = "seq_historia",allocationSize = 1 )
	@Column(name = "hist_id")
	private Integer id;
	
	@Column(name = "hist_alergias")
	private String alergias;
	
	@Column(name = "hist_historiaFamiliar")
	private String historiaFamiliar;
	
	@Column(name = "hist_numeroCama")
	private Integer numeroCama;
	
	@OneToOne
	@JoinColumn(name = "hist_fk_paciente")
	private Paciente paciente;

	//GET AND SET
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

	public String getHistoriaFamiliar() {
		return historiaFamiliar;
	}

	public void setHistoriaFamiliar(String historiaFamiliar) {
		this.historiaFamiliar = historiaFamiliar;
	}

	public Integer getNumeroCama() {
		return numeroCama;
	}

	public void setNumeroCama(Integer numeroCama) {
		this.numeroCama = numeroCama;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
}
