package ec.edu.uce.service.jpa.relacionadas.cajero;

import ec.edu.uce.modelo.jpa.relacionadas.cajero.CuentaHabiente;

public interface ICuentaHabienteService {

	public void create(CuentaHabiente cuentaHabiente);
	public CuentaHabiente read(Integer id); 
	public void update(CuentaHabiente cuentaHabiente); 
	public void delete(Integer id);
}
