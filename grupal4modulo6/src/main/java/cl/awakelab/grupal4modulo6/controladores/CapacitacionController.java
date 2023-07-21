package cl.awakelab.grupal4modulo6.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import cl.awakelab.grupal4modulo6.dao.ICapacitacionDao;
import cl.awakelab.grupal4modulo6.modelo.Capacitacion;

@Controller
public class CapacitacionController {

    private final ICapacitacionDao capacitacionDao;

    @Autowired
    public CapacitacionController(ICapacitacionDao capacitacionDao) {
        this.capacitacionDao = capacitacionDao;
    }

    @GetMapping("/crearCapacitacion")
    public String mostrarPaginaCrearCapacitacion() {
        return "crearCapacitacion"; // Nombre de la vista JSP o Thymeleaf (crear_capacitacion.jsp o crear_capacitacion.html)
    }

    @GetMapping("/listarCapacitaciones")
    public String mostrarPaginaListarCapacitaciones(Model model) {
        // Obtener la lista simulada de capacitaciones desde el DAO
        List<Capacitacion> listaCapacitaciones = capacitacionDao.obtenerCapacitaciones();

        // Imprimir la lista simulada de capacitaciones por consola
        for (Capacitacion capacitacion : listaCapacitaciones) {
            System.out.println(capacitacion);
        }

        // Agregar la lista al modelo para que esté disponible en la vista
        model.addAttribute("capacitaciones", listaCapacitaciones);

        return "listarCapacitaciones"; // Nombre de la vista JSP o Thymeleaf (listar_capacitaciones.jsp o listar_capacitaciones.html)
    }
}
