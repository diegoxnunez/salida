package cl.awakelab.prueba.model.domain.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data public class DetallepedidoDTO {
    @Column (name = "Pedido_ID")
    private int pedidoid;
    @ManyToOne
    @JoinColumn(name="Plato_ID")
    private int platoid;
    private int cantidad;
    private int subtotal;
}
