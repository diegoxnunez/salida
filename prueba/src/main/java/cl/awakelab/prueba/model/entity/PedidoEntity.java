package cl.awakelab.prueba.model.entity;

import cl.awakelab.prueba.model.domain.dto.CamareroDTO;
import cl.awakelab.prueba.model.domain.dto.MesaDTO;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "pedido")
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Mesa_ID")
    private int mesaid;
    @Column (name = "Camarero_ID")
    private int camareroid;
    @DateTimeFormat(pattern =  "yyyy-MM-dd")
    private Date fecha;
    private int total;

}
