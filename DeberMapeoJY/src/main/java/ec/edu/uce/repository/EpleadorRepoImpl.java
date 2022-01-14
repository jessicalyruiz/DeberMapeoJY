package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Empleado;

@Repository
public class EpleadorRepoImpl implements IEmpleadoRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Empleado empleado) {
		Object [] datosAInsertar= new Object[] {empleado.getId(),empleado.getNombre(),empleado.getApellido(),empleado.getPuesto(),empleado.getFechaInicio()};
		this.jdbcTemplate.update("insert into empleado(id,nombre,apellido,puesto, fechainicio) values(?,?,?,?,?)", datosAInsertar);
		
	}

	@Override
	public Empleado read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
