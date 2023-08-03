package cl.awakelab.prueba.model.persistence.mapping;

import cl.awakelab.prueba.model.domain.dto.DetallepedidoDTO;
import cl.awakelab.prueba.model.entity.DetallepedidoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetallepedidoMapper {
    @Mappings({})
    DetallepedidoDTO toDetallepedidoDTO(DetallepedidoEntity detallepedidoEntity);
    List<DetallepedidoDTO> toDetallepedido(List<DetallepedidoEntity>detallepedidoEntities);
    @InheritInverseConfiguration
    DetallepedidoEntity toDetalleEntity(DetallepedidoDTO detallepedidoDTO);
}
