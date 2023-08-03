package cl.awakelab.prueba.model.persistence.repository;

import cl.awakelab.prueba.model.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository  extends JpaRepository<PedidoEntity, Integer> {
}
