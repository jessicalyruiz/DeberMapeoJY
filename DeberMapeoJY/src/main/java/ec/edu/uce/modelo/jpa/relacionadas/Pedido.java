package ec.edu.uce.modelo.jpa.relacionadas;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@Column(name = "pedi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedido")
	@SequenceGenerator(name = "seq_pedido", sequenceName = "seq_pedido",allocationSize = 1 )
	private Integer id;
	
	@Column(name = "pedi_fecha", columnDefinition = "TIMESTAMP")
	private LocalDateTime fecha;
	
	@Column(name = "pedi_numero")
	private String numero;
	
	@Column(name = "pedi_cliente")
	private String Cliente;

	//un pedido puede tener muchos detalles
		@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)//se dispara en cascada las inserciones
		private List<DetallePedido> detalles;
	
	public List<DetallePedido> getDetalles() {
			return detalles;
		}

		public void setDetalles(List<DetallePedido> detalles) {
			this.detalles = detalles;
		}

	//getters y setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	
	
	
}
