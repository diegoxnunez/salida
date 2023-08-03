package cl.awakelab.prueba.model.domain.dto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@Data public class PedidoDTO {
    private int id;
    @Column (name = "Mesa_ID")
    private int mesaid;
    @Column (name = "Camarero_ID")
    private int camareroid;
    private Date fecha;
    private int total;
    private MesaDTO mesaDTO;
    private CamareroDTO camareroDTO;

}
