package cl.awakelab.prueba.model.domain.service;

import cl.awakelab.prueba.model.domain.dto.MesaDTO;
import cl.awakelab.prueba.model.persistence.mapping.MesaMapper;
import cl.awakelab.prueba.model.persistence.repository.MesaRepository;
import cl.awakelab.prueba.web.service.MesaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MesaServiceImpl implements MesaService {
    private final MesaRepository repository;
    private final MesaMapper mapper;

    public MesaServiceImpl(MesaRepository repository, MesaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<MesaDTO>> findAll() {
        return Optional.of(mapper.toMesa(repository.findAll()));
    }

    @Override
    public Optional<MesaDTO> findOne(int id) {
        return repository.findById(id).map(mapper::toMesaDTO);
    }

    @Override
    public Optional<MesaDTO> create(MesaDTO mesaDTO) {
        return Optional.of(mapper.toMesaDTO(
                        repository.save(
                                mapper.toMesaEntity(mesaDTO)
                        )
                )
        );
    }

    @Override
    public Optional<MesaDTO> update(MesaDTO mesaDTO) {
        return Optional.of(mapper.toMesaDTO(
                        repository.save(
                                mapper.toMesaEntity(mesaDTO)
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