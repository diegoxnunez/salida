package cl.awakelab.prueba.web.controller;

import cl.awakelab.prueba.web.service.CamareroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
@RequestMapping("/camarero")
public class CamareroController {
    private final CamareroService service;

    public CamareroController(CamareroService service) {
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model){
        var result = service.findAll();
        log.info ("result: " + result);

        model.addAttribute("camareros",service.findAll() );
        return "camareroList";
    }
}
