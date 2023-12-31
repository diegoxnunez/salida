package cl.awakelab.prueba.web.controller;

import cl.awakelab.prueba.model.domain.dto.CamareroDTO;
import cl.awakelab.prueba.web.service.CamareroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/camarero")
public class CamareroController {
    private final CamareroService service;

    public CamareroController(CamareroService service) {
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model) {
        var result = service.findAll();
        log.info("result: " + result);

        model.addAttribute("camareros", service.findAll());
        return "camareroList";
    }

    @PostMapping("/crear")
    public ResponseEntity<CamareroDTO> create(@RequestBody CamareroDTO camareroDTO) {
        return service.create(camareroDTO)
                .map(t -> new ResponseEntity<>(t, HttpStatus.CREATED))
                .orElse(new ResponseEntity<>(HttpStatus.CONFLICT));
    }

    @PatchMapping("/update")
    public ResponseEntity<CamareroDTO> update(@RequestBody CamareroDTO camareroDTO){
        return service.update(camareroDTO)
                .map(t -> new ResponseEntity<>(t, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{camareroId}")
    public ResponseEntity<Boolean> delete(@PathVariable int camareroId){
        return new ResponseEntity<Boolean>(service.delete(camareroId), HttpStatus.OK);
    }
}

