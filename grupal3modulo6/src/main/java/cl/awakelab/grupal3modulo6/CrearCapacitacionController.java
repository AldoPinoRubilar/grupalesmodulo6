package cl.awakelab.grupal3modulo6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrearCapacitacionController {

    @GetMapping("/crearCapacitacion")
    public String mostrarPaginaCrearCapacitacion() {
        return "crearCapacitacion"; // Nombre de la vista JSP o Thymeleaf (crear_capacitacion.jsp o crear_capacitacion.html)
    }
}
