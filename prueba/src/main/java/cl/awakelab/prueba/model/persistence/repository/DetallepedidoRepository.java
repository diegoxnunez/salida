package cl.awakelab.prueba.model.persistence.repository;

import cl.awakelab.prueba.model.entity.DetallepedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallepedidoRepository extends JpaRepository<DetallepedidoEntity, Integer> {
}
