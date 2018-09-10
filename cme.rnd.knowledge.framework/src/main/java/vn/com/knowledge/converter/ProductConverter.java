package vn.com.knowledge.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.com.knowledge.dto.ProductDTO;
import vn.com.knowledge.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ThanhVQ
 */


@Component("productConverter")
public class ProductConverter implements SuperConverter<ProductDTO, ProductEntity>{
    @Override
    public List<ProductDTO> convertEntitiesToDTOs(List<ProductEntity> entities) {
        return null;
    }

    @Override
    public List<ProductEntity> convertDTOsToEntities(List<ProductDTO> dtos) {
        return null;
    }

    @Override
    public ProductDTO convertToDTO(ProductEntity entity) {
        return null;
    }

    @Override
    public ProductEntity convertToEntity(ProductDTO dto) {
        return null;
    }

//    @Autowired
//    private ModelMapper modelMapper;
//
//    /**
//     * Convert from entities list to dtos list
//     *
//     * @param entities list
//     * @return dtos list
//     */
//    @Override
//    public List<ProductDTO> convertEntitiesToDTOs(List<ProductEntity> entities) {
//        if (entities.isEmpty()) {
//            return new ArrayList<>();
//        }
//        return entities.stream().map(entity -> convertToDTO(entity)).collect(Collectors.toList());
//    }
//
//    /**
//     * Convert from dtos list to entities list
//     *
//     * @param dtos list
//     * @return entities list
//     */
//    @Override
//    public List<ProductEntity> convertDTOsToEntities(List<ProductDTO> dtos) {
//        if (dtos.isEmpty()) {
//            return new ArrayList<>();
//        }
//        return dtos.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
//    }
//
//    /**
//     * Convert from entity to dto
//     *
//     * @param entity
//     * @return dto
//     */
//    @Override
//    public ProductDTO convertToDTO(ProductEntity entity) {
//        return modelMapper.map(entity, ProductDTO.class);
//    }
//
//    /**
//     * Convert from dto to entity
//     *
//     * @param dto
//     * @return entity
//     */
//    @Override
//    public ProductEntity convertToEntity(ProductDTO dto) {
//        return modelMapper.map(dto, ProductEntity.class);
//    }
}
