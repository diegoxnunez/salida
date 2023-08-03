package cl.awakelab.prueba.model.domain.service;

import cl.awakelab.prueba.model.domain.dto.PedidoDTO;
import cl.awakelab.prueba.model.persistence.mapping.PedidoMapper;
import cl.awakelab.prueba.model.persistence.repository.PedidoRepository;
import cl.awakelab.prueba.web.service.PedidoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {
    private final PedidoRepository repository;
    private final PedidoMapper mapper;

    public PedidoServiceImpl(PedidoRepository repository, PedidoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<PedidoDTO>> findAll() {
        return Optional.of(mapper.toPedido(repository.findAll()));
    }

    @Override
    public Optional<PedidoDTO> findOne(int id) {
        return repository.findById(id).map(mapper::toPedidoDTO);
    }

    @Override
    public Optional<PedidoDTO> create(PedidoDTO pedidoDTO) {
        return Optional.of(mapper.toPedidoDTO(
                        repository.save(
                                mapper.toPedidoEntity(pedidoDTO)
                        )
                )
        );
    }

    @Override
    public Optional<PedidoDTO> update(PedidoDTO pedidoDTO) {
        return Optional.of(mapper.toPedidoDTO(
                        repository.save(
                                mapper.toPedidoEntity(pedidoDTO)
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
