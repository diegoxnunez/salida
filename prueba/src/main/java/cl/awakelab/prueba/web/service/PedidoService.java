package cl.awakelab.prueba.web.service;

import cl.awakelab.prueba.model.domain.dto.CamareroDTO;
import cl.awakelab.prueba.model.domain.dto.PedidoDTO;

import java.util.List;
import java.util.Optional;

public interface PedidoService {
    Optional<List<PedidoDTO>> findAll();
    Optional<PedidoDTO>findOne(int id);
    Optional<PedidoDTO>create(PedidoDTO pedidoDTO);
    Optional<PedidoDTO>update(PedidoDTO pedidoDTO);
    boolean delete(int id);
}
