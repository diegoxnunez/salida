package cl.awakelab.prueba.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "camarero")
@NoArgsConstructor
public @Data class CamareroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int edad;
    @Column(name = "fecha_inicio")
    private Data fechainicio;

}
