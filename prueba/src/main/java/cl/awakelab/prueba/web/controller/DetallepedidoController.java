package cl.awakelab.prueba.web.controller;


import cl.awakelab.prueba.model.domain.dto.DetallepedidoDTO;
import cl.awakelab.prueba.web.service.DetallepedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/detalle")
public class DetallepedidoController {
    private final DetallepedidoService service;

    public DetallepedidoController(DetallepedidoService service) {
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("detalles", service.findAll());
        return "detallepedidoList";
    }

    @PostMapping("/crear")
    public ResponseEntity<DetallepedidoDTO> create(@RequestBody DetallepedidoDTO detallepedidoDTO) {
        return service.create(detallepedidoDTO)
                .map(t -> new ResponseEntity<>(t, HttpStatus.CREATED))
                .orElse(new ResponseEntity<>(HttpStatus.CONFLICT));
    }

    @PatchMapping("/update")
    public ResponseEntity<DetallepedidoDTO> update(@RequestBody DetallepedidoDTO detallepedidoDTO){
        return service.update(detallepedidoDTO)
                .map(t -> new ResponseEntity<>(t, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{detalleId}")
    public ResponseEntity<Boolean> delete(@PathVariable int detalleId){
        return new ResponseEntity<Boolean>(service.delete(detalleId), HttpStatus.OK);
    }
}
