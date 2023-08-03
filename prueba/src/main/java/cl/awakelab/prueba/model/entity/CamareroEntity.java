package cl.awakelab.prueba.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "camarero")
@NoArgsConstructor
@Data public class CamareroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int edad;
    @Column(name = "Fecha_Inicio")
    private Date fechainicio;

}
