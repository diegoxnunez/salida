package cl.awakelab.prueba.web.service;

import cl.awakelab.prueba.model.domain.dto.CamareroDTO;

import java.util.List;
import java.util.Optional;

public interface CamareroService {
    Optional<List<CamareroDTO>> findAll();
    Optional<CamareroDTO>findOne(int id);
    Optional<CamareroDTO>create(CamareroDTO camareroDTO);
    Optional<CamareroDTO>update(CamareroDTO camareroDTO);
    boolean delete(int id);
}
