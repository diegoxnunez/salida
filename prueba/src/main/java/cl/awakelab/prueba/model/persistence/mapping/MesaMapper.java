package cl.awakelab.prueba.model.persistence.mapping;

import cl.awakelab.prueba.model.domain.dto.MesaDTO;
import cl.awakelab.prueba.model.entity.MesaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MesaMapper {
    @Mappings({})
    MesaDTO toMesaDTO(MesaEntity mesaEntity);
    List<MesaDTO>toMesa(List<MesaEntity> mesaEntities);
    @InheritInverseConfiguration
    MesaEntity toMesaEntity(MesaDTO mesaDTO);
}