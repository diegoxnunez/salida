package cl.awakelab.prueba.web.service;

import cl.awakelab.prueba.model.domain.dto.MesaDTO;

import java.util.List;
import java.util.Optional;

public interface MesaService {
    Optional<List<MesaDTO>> findAll();
    Optional<MesaDTO>findOne(int id);
    Optional<MesaDTO>create(MesaDTO mesaDTO);
    Optional<MesaDTO>update(MesaDTO mesaDTO);

    boolean delete(int id);

}