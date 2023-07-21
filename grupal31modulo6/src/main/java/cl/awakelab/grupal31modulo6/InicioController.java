package cl.awakelab.grupal31modulo6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {

    /**
     * Maneja las solicitudes que se le hacen a la raíz del sitio
     * @return 
     * 
     * @return un objeto {@link ModelAndView} con la respuesta al cliente
     */
    //@RequestMapping(path = "/", method = RequestMethod.GET)
    //public ModelAndView mostrarInicio() {
        //return new ModelAndView("home", "mensaje", "Hola Mundo!");
    	//return "redirect:/inicio";

    @GetMapping("/")
    public String mostrarPaginaInicio() {
        return "inicio"; // Nombre de la vista JSP o Thymeleaf (inicio.jsp o inicio.html)
    }

}
