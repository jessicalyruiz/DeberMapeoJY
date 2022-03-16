package ec.edu.uce.repository.jpa.relacionadas.cajero;


import ec.edu.uce.modelo.jpa.relacionadas.cajero.CuentaHabiente;

public interface ICuentaHabienteRepo {

	public void create(CuentaHabiente cuentaHabiente);
	public CuentaHabiente read(Integer id); 
	public void update(CuentaHabiente cuentaHabiente); 
	public void delete(Integer id); 
}
