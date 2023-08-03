package cl.awakelab.prueba.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalle_pedido")
@NoArgsConstructor
@Data public class DetallepedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Pedido_ID")
    private int pedidoid;
    @Column(name = "Plato_ID")
    private int platoid;
    private int cantidad;
    private int subtotal;

}
