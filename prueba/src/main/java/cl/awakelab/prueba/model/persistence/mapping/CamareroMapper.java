package cl.awakelab.prueba.model.persistence.mapping;

import cl.awakelab.prueba.model.domain.dto.CamareroDTO;
import cl.awakelab.prueba.model.entity.CamareroEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CamareroMapper {
    @Mappings({})
    CamareroDTO toCamareroDTO(CamareroEntity camareroEntity);
    List<CamareroDTO> toCamarero(List<CamareroEntity> camareroEntities);
    @InheritInverseConfiguration
    CamareroEntity toCamareroEntity(CamareroDTO camareroDTO);
}
