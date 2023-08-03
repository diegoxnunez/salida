package cl.awakelab.prueba.web.controller;

import cl.awakelab.prueba.web.service.CamareroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller")
public class CamareroController {
    private final CamareroService service;

    public CamareroController(CamareroService service) {
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("camarero", service.findAll());
        return "customerList";
    }
}
