package ec.edu.uce.modelo.jpa.relacionadas;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "consumo")
public class Consumo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_consumo")
	@SequenceGenerator(name = "seq_consumo", sequenceName = "seq_consumo", allocationSize = 1)
	@Column(name = "cons_id")
	private Integer id;
	
	@Column(name = "cons_valor")
	private BigDecimal valor;
	
	@Column(name = "cons_fecha")
	private LocalDateTime fecha;
	
	//clave foranea
	@ManyToOne
	@JoinColumn(name = "cons_fk_tarjeta")
	private TarjetaCredito tarjeta;

	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public TarjetaCredito getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Consumo [id=" + id + ", valor=" + valor + ", fecha=" + fecha + ", tarjeta=" + tarjeta + "]";
	}
	
	
	
}
