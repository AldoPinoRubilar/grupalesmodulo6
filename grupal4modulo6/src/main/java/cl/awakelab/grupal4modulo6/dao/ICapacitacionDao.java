package cl.awakelab.grupal4modulo6.dao;

import java.util.List;

import cl.awakelab.grupal4modulo6.modelo.Capacitacion;

public interface ICapacitacionDao {

    List<Capacitacion> obtenerCapacitaciones();

    boolean crearCapacitacion(Capacitacion capacitacion);
}