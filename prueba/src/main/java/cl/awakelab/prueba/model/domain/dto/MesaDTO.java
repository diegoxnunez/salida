package cl.awakelab.prueba.model.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data public class MesaDTO {
    private int id;
    private int numero;
    private int capacidad;
    private String Ubicacion;
}
