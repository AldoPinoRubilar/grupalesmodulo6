package cl.awakelab.grupal31modulo6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CapacitacionController {

    @GetMapping("/crearCapacitacion")
    public String mostrarPaginaCrearCapacitacion() {
        return "crearCapacitacion"; // Nombre de la vista JSP o Thymeleaf (crear_capacitacion.jsp o crear_capacitacion.html)
    }

    @GetMapping("/listarCapacitaciones")
    public String mostrarPaginaListarCapacitaciones() {
        return "listarCapacitaciones"; // Nombre de la vista JSP o Thymeleaf (listar_capacitaciones.jsp o listar_capacitaciones.html)
    }
}
