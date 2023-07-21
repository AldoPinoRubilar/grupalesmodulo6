package cl.awakelab.grupal4modulo6.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String mostrarPaginaContacto() {
        return "contacto"; // Nombre de la vista JSP o Thymeleaf (contacto.jsp o contacto.html)
    }
}