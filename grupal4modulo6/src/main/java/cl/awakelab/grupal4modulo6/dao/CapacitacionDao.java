package cl.awakelab.grupal4modulo6.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.awakelab.grupal4modulo6.modelo.Capacitacion;

@Repository
public class CapacitacionDao implements ICapacitacionDao {

    private List<Capacitacion> listaCapacitaciones;

    public CapacitacionDao() {
        // Inicializamos la lista y agregamos tres capacitaciones simuladas
        listaCapacitaciones = new ArrayList<>();
        listaCapacitaciones.add(new Capacitacion("Capacitación 1", "1", "12345678-9", "2023-07-21", "09:00", "Sala A", "2 horas", 20));
        listaCapacitaciones.add(new Capacitacion("Capacitación 2", "2", "98765432-1", "2023-07-22", "14:00", "Sala B", "3 horas", 30));
        listaCapacitaciones.add(new Capacitacion("Capacitación 3", "3", "55555555-5", "2023-07-23", "10:30", "Sala C", "1.5 horas", 15));
        
        // Mostramos la lista de capacitaciones por consola
        for (Capacitacion capacitacion : listaCapacitaciones) {
            System.out.println(capacitacion);
        }
    }

    @Override
    public List<Capacitacion> obtenerCapacitaciones() {
        // Simulamos obtener las capacitaciones de una fuente de datos (base de datos, API, etc.)
        return listaCapacitaciones;
    }

    @Override
    public boolean crearCapacitacion(Capacitacion capacitacion) {
        // Aquí puedes implementar la lógica para crear una capacitación en la fuente de datos
        // Por simplicidad, asumiremos que siempre se crea con éxito en este ejemplo
        listaCapacitaciones.add(capacitacion);
        return true;
    }
}
