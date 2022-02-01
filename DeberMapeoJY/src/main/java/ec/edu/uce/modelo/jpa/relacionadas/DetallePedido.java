package ec.edu.uce.modelo.jpa.relacionadas;

import java.math.BigDecimal;

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
@Table(name = "detalle_factura")
public class DetallePedido {

	@Id
	@Column(name = "deta_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_detalle")
	@SequenceGenerator(name = "seq_detalle", sequenceName = "seq_detalle",allocationSize = 1 )
	private Integer id;
	
	@Column(name = "deta_producto")
	private String producto;
	
	@Column(name = "deta_cantidad")
	private Integer cantidad;
	
	@Column(name = "deta_precio")
	private BigDecimal precio;
	

	
	@ManyToOne
	@JoinColumn(name="pedi_id")
	private Pedido pedido; //***mapped by de la entidad pedido

//GETTERS Y SETTERS

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public Integer getCantidad() {
		return cantidad;
	}



	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	public BigDecimal getPrecio() {
		return precio;
	}



	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}



	public Pedido getPedido() {
		return pedido;
	}



	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	

	
}
