package ec.edu.uce.modelo;

import java.sql.Date;
import java.time.LocalDate;

public class Producto {
	private String nombre;
	private Integer codigo;
	private LocalDate fechaElaboracion;
	private LocalDate fechaVencimiento;
	private Integer cantidad;
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public LocalDate getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(LocalDate localDate) {
		this.fechaElaboracion = localDate;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate localDate) {
		this.fechaVencimiento = localDate;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", fechaElaboracion=" + fechaElaboracion
				+ ", fechaVencimiento=" + fechaVencimiento + ", cantidad=" + cantidad + "]";
	}
	
	
}
