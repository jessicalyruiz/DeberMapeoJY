package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Librojpa {

	@Column(name = "titulo")
	private String titulo;
	
	@Id
	@GeneratedValue
	@Column(name = "isbn")
	private Integer isbn;
	
	@Column(name = "autor")
	private String autor;
	
	@Column(name = "sinopsis")
	private String sinopsis;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	
	//getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(int i) {
		this.cantidad = i;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", sinopsis=" + sinopsis
				+ ", cantidad=" + cantidad + "]";
	}
	
	
}
