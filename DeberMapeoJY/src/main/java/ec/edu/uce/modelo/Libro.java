package ec.edu.uce.modelo;

public class Libro {

	private String titulo;
	private Integer isbn;
	private String autor;
	private String sinopsis;
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
