package cl.awakelab.prueba.web.service;

import cl.awakelab.prueba.model.domain.dto.DetallepedidoDTO;
import java.util.List;
import java.util.Optional;
public interface DetallepedidoService {
    Optional<List<DetallepedidoDTO>> findAll();
    Optional<DetallepedidoDTO>findOne(int id);
    Optional<DetallepedidoDTO>create(DetallepedidoDTO detallepedidoDTO);
    Optional<DetallepedidoDTO>update(DetallepedidoDTO detallepedidoDTO);
    boolean delete(int id);

}
