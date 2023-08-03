package cl.awakelab.prueba.model.persistence.repository;

import cl.awakelab.prueba.model.entity.CamareroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamareroRepository extends JpaRepository<CamareroEntity, Integer> {
}
