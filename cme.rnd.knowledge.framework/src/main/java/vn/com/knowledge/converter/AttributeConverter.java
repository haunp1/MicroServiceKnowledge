package vn.com.knowledge.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.com.knowledge.dto.AttributeDTO;
import vn.com.knowledge.entity.AttributeEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ThanhVQ
 */

@Component("attributeConverter")
public class AttributeConverter implements SuperConverter<AttributeDTO, AttributeEntity> {

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Convert from entities list to dtos list
     *
     * @param entities list
     * @return dtos list
     */
    @Override
    public List<AttributeDTO> convertEntitiesToDTOs(List<AttributeEntity> entities) {
        if (entities.isEmpty()) {
            return new ArrayList<>();
        }
        return entities.stream().map(entity -> convertToDTO(entity)).collect(Collectors.toList());
    }

    /**
     * Convert from dtos list to entities list
     *
     * @param dtos list
     * @return entities list
     */
    @Override
    public List<AttributeEntity> convertDTOsToEntities(List<AttributeDTO> dtos) {
        if (dtos.isEmpty()) {
            return new ArrayList<>();
        }
        return dtos.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }

    /**
     * Convert from entity to dto
     *
     * @param entity
     * @return dto
     */
    @Override
    public AttributeDTO convertToDTO(AttributeEntity entity) {
        return modelMapper.map(entity, AttributeDTO.class);
    }

    /**
     * Convert from dto to entity
     *
     * @param dto
     * @return entity
     */
    @Override
    public AttributeEntity convertToEntity(AttributeDTO dto) {
        return modelMapper.map(dto, AttributeEntity.class);
    }
}
