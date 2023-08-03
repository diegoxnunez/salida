package cl.awakelab.prueba.model.persistence.mapping;

import cl.awakelab.prueba.model.domain.dto.PedidoDTO;
import cl.awakelab.prueba.model.entity.PedidoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PedidoMapper {
    @Mappings({})
    PedidoDTO toPedidoDTO(PedidoEntity pedidoEntity);
    List<PedidoDTO> toPedido(List<PedidoEntity> pedidoEntities);
    @InheritInverseConfiguration
    PedidoEntity toPedidoEntity(PedidoDTO pedidoDTO);
}
