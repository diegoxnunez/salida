package cl.awakelab.prueba.model.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class CamareroDTO {
    private int id;
    private String nombre;
    private int edad;
    private Data fechainicio;
}