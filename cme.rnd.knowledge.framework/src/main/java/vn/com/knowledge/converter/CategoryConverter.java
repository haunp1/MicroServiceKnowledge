package vn.com.knowledge.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.com.knowledge.dto.CategoryDTO;
import vn.com.knowledge.entity.CategoryEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NhanVT3
 */

@Component("categoryConverter")
public class CategoryConverter implements SuperConverter<CategoryDTO, CategoryEntity> {

    @Autowired
    private ModelMapper modelMapper;

    /**
     *
     * @param entities
     * @return List CategoryDTO
     */
    @Override
    public List<CategoryDTO> convertEntitiesToDTOs(List<CategoryEntity> entities) {
       if(entities.isEmpty()){
           return new ArrayList<>();
       }
       return  entities.stream().map(entity -> convertToDTO(entity)).collect(Collectors.toList());
    }

    /**
     *
     * @param dtos
     * @return List CategoryEntity
     */
    @Override
    public List<CategoryEntity> convertDTOsToEntities(List<CategoryDTO> dtos) {
        if (dtos.isEmpty()) {
            return new ArrayList<>();
        }
        return dtos.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }

    /**
     *
     * @param entity
     * @return CategoryDTO
     */
    @Override
    public CategoryDTO convertToDTO(CategoryEntity entity) {
        return modelMapper.map(entity, CategoryDTO.class);
    }

    /**
     *
     * @param dto
     * @return CategoryEntity
     */
    @Override
    public CategoryEntity convertToEntity(CategoryDTO dto) {
        return modelMapper.map(dto, CategoryEntity.class);
    }
}
