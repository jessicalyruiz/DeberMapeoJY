package ec.edu.uce.repository.jpa.relacionadas.cajero;

import ec.edu.uce.modelo.jpa.relacionadas.cajero.HistoricoRetiros;

public interface IHistoricoRetitoRepo {

	public void create(HistoricoRetiros historicoRetiros);
	public HistoricoRetiros read(Integer id); 
	public void update(HistoricoRetiros historicoRetiros); 
	public void delete(Integer id);
}
