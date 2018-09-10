package vn.com.knowledge.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.com.knowledge.dto.ImageDTO;
import vn.com.knowledge.entity.ImageEntity;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component("imageConverter")
public class ImageConverter implements SuperConverter<ImageDTO, ImageEntity> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ImageDTO convertToDTO(ImageEntity entity) {
        return modelMapper.map(entity, ImageDTO.class);
    }

    /**
     * @param dto
     * @return CategoryEntity
     */
    @Override
    public ImageEntity convertToEntity(ImageDTO dto) {
        return modelMapper.map(dto, ImageEntity.class);
    }

    @Override
    public List<ImageDTO> convertEntitiesToDTOs(List<ImageEntity> entities) {
        if (entities.isEmpty()) {
            return new ArrayList<>();
        }
        return entities.stream().map(entity -> convertToDTO(entity)).collect(Collectors.toList());
    }

    @Override
    public List<ImageEntity> convertDTOsToEntities(List<ImageDTO> dtos) {
        if (dtos.isEmpty()) {
            return new ArrayList<>();
        }
        return dtos.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }
}
