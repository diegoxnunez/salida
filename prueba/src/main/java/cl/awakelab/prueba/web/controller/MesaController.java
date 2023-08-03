package cl.awakelab.prueba.web.controller;

import cl.awakelab.prueba.web.service.MesaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mesa")
public class MesaController {
    private final MesaService service;

    public MesaController(MesaService service) {
        this.service = service;
    }
    @GetMapping
    public String findAll(Model model){
        model.addAttribute("mesas", service.findAll());
        return "mesaList";
    }


}