package cl.awakelab.prueba.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "camarero")
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
