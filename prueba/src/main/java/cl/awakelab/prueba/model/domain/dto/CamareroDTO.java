package cl.awakelab.prueba.model.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data public class CamareroDTO {
    private int id;
    private String nombre;
    private int edad;
    private Date fechainicio;
}