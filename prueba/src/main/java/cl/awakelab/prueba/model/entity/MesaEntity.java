package cl.awakelab.prueba.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mesa")
public class MesaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numero;
    private int capacidad;
    private String Ubicacion;
}
