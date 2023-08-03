package cl.awakelab.prueba.model.domain.service;

import cl.awakelab.prueba.model.domain.dto.DetallepedidoDTO;
import cl.awakelab.prueba.model.persistence.mapping.DetallepedidoMapper;
import cl.awakelab.prueba.model.persistence.repository.DetallepedidoRepository;
import cl.awakelab.prueba.web.service.DetallepedidoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallepedidoServiceImpl implements DetallepedidoService {
    private final DetallepedidoRepository repository;
    private final DetallepedidoMapper mapper;

    public DetallepedidoServiceImpl(DetallepedidoRepository repository, DetallepedidoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<DetallepedidoDTO>> findAll() {
        return Optional.of(mapper.toDetallepedido(repository.findAll()));
    }

    @Override
    public Optional<DetallepedidoDTO> findOne(int id) {
        return repository.findById(id).map(mapper::toDetallepedidoDTO);

    }

    @Override
    public Optional<DetallepedidoDTO> create(DetallepedidoDTO detallepedidoDTO) {
        return Optional.of(
                mapper.toDetallepedidoDTO(
                        repository.save(
                                mapper.toDetalleEntity(detallepedidoDTO)
                        )
                )
        );
    }

    @Override
    public Optional<DetallepedidoDTO> update(DetallepedidoDTO detallepedidoDTO) {
        return Optional.of(
                mapper.toDetallepedidoDTO(
                        repository.save(
                                mapper.toDetalleEntity(detallepedidoDTO)
                        )
                )
        );
    }

    @Override
    public boolean delete(int id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }

        return false;
    }
}
