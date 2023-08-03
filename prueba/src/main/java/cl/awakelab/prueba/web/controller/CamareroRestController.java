package cl.awakelab.prueba.web.controller;

import cl.awakelab.prueba.model.domain.dto.CamareroDTO;
import cl.awakelab.prueba.web.service.CamareroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/camarero")
public class CamareroRestController {
    private final CamareroService service;

    public CamareroRestController(CamareroService service) {
        this.service = service;
    }
        @GetMapping("/all")
                public ResponseEntity<List<CamareroDTO>> findAll() {
            return service.findAll()
                    .map(camarero ->new ResponseEntity<>(camarero, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
    }

