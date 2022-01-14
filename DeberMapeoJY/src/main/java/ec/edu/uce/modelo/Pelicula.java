package ec.edu.uce.modelo;

public class Pelicula {

	private String actorPrincipal;
	private Integer  codigo;
	private String sinopsis;
	private String titulo;
	private Integer vecesVista;
	
	//gettgers setters
	public String getActorPrincipal() {
		return actorPrincipal;
	}
	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getVecesVista() {
		return vecesVista;
	}
	public void setVecesVista(Integer vecesVista) {
		this.vecesVista = vecesVista;
	}
	@Override
	public String toString() {
		return "Pelicula [actorPrincipal=" + actorPrincipal + ", codigo=" + codigo + ", sinopsis=" + sinopsis
				+ ", titulo=" + titulo + ", vecesVista=" + vecesVista + "]";
	}
	
	
	
}
