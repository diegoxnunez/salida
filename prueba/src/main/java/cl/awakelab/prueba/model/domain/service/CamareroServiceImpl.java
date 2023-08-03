package cl.awakelab.prueba.model.domain.service;

import cl.awakelab.prueba.model.domain.dto.CamareroDTO;
import cl.awakelab.prueba.model.persistence.mapping.CamareroMapper;
import cl.awakelab.prueba.model.persistence.repository.CamareroRepository;
import cl.awakelab.prueba.web.service.CamareroService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CamareroServiceImpl implements CamareroService {
    private final CamareroRepository repository;
    private final CamareroMapper mapper;

    public CamareroServiceImpl(CamareroRepository repository, CamareroMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<CamareroDTO>> findAll() {
        var result = repository.findAll();
        return Optional.of(mapper.toCamarero(result));
    }

    @Override
    public Optional<CamareroDTO> findOne(int id) {
        return repository.findById(id).map(mapper::toCamareroDTO);
    }

    @Override
    public Optional<CamareroDTO> create(CamareroDTO camareroDTO) {

        return Optional.of(mapper.toCamareroDTO(
                        repository.save(
                                mapper.toCamareroEntity(camareroDTO)
                        )
                )
        );
    }

    @Override
    public Optional<CamareroDTO> update(CamareroDTO camareroDTO) {
        return Optional.of(mapper.toCamareroDTO(
                        repository.save(
                                mapper.toCamareroEntity(camareroDTO)
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
