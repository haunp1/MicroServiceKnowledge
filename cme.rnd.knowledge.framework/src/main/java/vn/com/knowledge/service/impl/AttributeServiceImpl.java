package vn.com.knowledge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.com.knowledge.common.Message;
import vn.com.knowledge.common.ObjResponse;
import vn.com.knowledge.converter.AttributeConverter;
//import vn.com.knowledge.dao.AttributeDAO;
import vn.com.knowledge.dto.AttributeDTO;
import vn.com.knowledge.dto.CategoryDTO;
import vn.com.knowledge.dto.ResponseModal;
import vn.com.knowledge.entity.AttributeEntity;
import vn.com.knowledge.entity.CategoryEntity;
import vn.com.knowledge.service.AttributeService;

import java.util.List;

/**
 * @author ThanhVQ
 */

@Service("attributeService")
@ComponentScan(value = "vn.com.knowledge")
public class AttributeServiceImpl implements AttributeService {
    @Override
    public List<AttributeDTO> findAllCheckIsDeleted(boolean isDeleted, int offSet, int limit, String soft) {
        return null;
    }

    @Override
    public AttributeDTO findByName(String name) {
        return null;
    }

    @Override
    public List<AttributeDTO> findAllCheckIsDeletedAndNameContaining(boolean isDeleted, String name, int offSet, int limit, String soft) {
        return null;
    }

    @Override
    public ResponseModal add(AttributeDTO attributeDTO) {
        return null;
    }

    @Override
    public ResponseModal update(AttributeDTO attributeDTO, Long id) {
        return null;
    }

    @Override
    public ResponseModal findAll() {
        return null;
    }

    @Override
    public ResponseModal findById(Long id) {
        return null;
    }

    @Override
    public ResponseModal deleteById(Long id) {
        return null;
    }


//    @Autowired
//    private AttributeDAO attributeDAO;
//
//    @Autowired
//    private AttributeConverter attributeConverter;
//
//    /**
//     * Add or update dto
//     *
//     * @param attributeDTO
//     * @return AttributeDTO
//     */
//    @Override
//    public AttributeDTO addOrUpdate(AttributeDTO attributeDTO) {
//        AttributeEntity entity = attributeConverter.convertToEntity(attributeDTO);
//        return attributeConverter.convertToDTO(attributeDAO.addOrUpdate(entity));
//    }
//
//    /**
//     * Find all dto
//     *
//     * @return List<AttributeDTO>
//     */
//    @Override
//    public List<AttributeDTO> findAll() {
//        return attributeConverter.convertEntitiesToDTOs(attributeDAO.findAll());
//    }
//
//
//    /**
//     * Find dto by using id
//     *
//     * @param id
//     * @return AttributeDTO
//     */
//    @Override
//    public AttributeDTO findById(Long id) {
//        if (id == null) {
//            return new AttributeDTO();
//        }
//        return attributeConverter.convertToDTO(attributeDAO.findById(id).orElse(new AttributeEntity()));
//    }
//
//
//    /**
//     * Delete dto by using id
//     *
//     * @param id
//     * @return ObjResponse
//     */
//    @Override
//    public ObjResponse deleteById(Long id) {
//        AttributeDTO attributeDTO = findById(id);
//        if (attributeDTO.getId() != 0 && attributeDTO.isDeleted() != true) {
//            attributeDTO.setDeleted(true);
//            attributeDAO.addOrUpdate(attributeConverter.convertToEntity(attributeDTO));
//            return new ObjResponse(Message.SUCCESS_CODE, Message.SUCCESS_MESSAGE);
//        }
//        return new ObjResponse(Message.FIND_NOT_ENTITY_CODE, Message.FIND_NOT_ENTITY_MESSAGE);
//    }
//
//    @Override
//    public List<AttributeDTO> findAllCheckIsDeleted(boolean isDeleted, int offSet, int limit, String soft) {
//        if (soft != null) {
//            Sort.Direction direction = Sort.Direction.ASC;
//            if (soft.equalsIgnoreCase("DESC")) {
//                direction = Sort.Direction.DESC;
//            }
//            return attributeConverter.convertEntitiesToDTOs(attributeDAO.findByIsDeleted(isDeleted, PageRequest.of(offSet, limit, direction, "name")).getContent());
//        }
//
//        return attributeConverter.convertEntitiesToDTOs(attributeDAO.findByIsDeleted(isDeleted, PageRequest.of(offSet, limit)).getContent());
//    }
//
//    @Override
//    public AttributeDTO findByName(String name) {
//        if (name == null) {
//            return new AttributeDTO();
//        }
//        return attributeConverter.convertToDTO(attributeDAO.findByName(name).orElse(new AttributeEntity()));
//    }
//
//    @Override
//    public List<AttributeDTO> findAllCheckIsDeletedAndNameContaining(boolean isDeleted, String name, int offSet, int limit, String soft) {
//        if (soft != null) {
//            Sort.Direction direction = Sort.Direction.ASC;
//            if (soft.equalsIgnoreCase("DESC")) {
//                direction = Sort.Direction.DESC;
//            }
//            return attributeConverter.convertEntitiesToDTOs(attributeDAO.findByIsDeletedAndNameContaining(isDeleted, name, PageRequest.of(offSet, limit, direction, "name")).getContent());
//        }
//
//        return attributeConverter.convertEntitiesToDTOs(attributeDAO.findByIsDeletedAndNameContaining(isDeleted, name, PageRequest.of(offSet, limit)).getContent());
//    }
//
//    @Override
//    public ObjResponse add(AttributeDTO attributeDTO) {
//        AttributeEntity entity = attributeConverter.convertToEntity(attributeDTO);
//        try {
//            attributeDAO.add(entity);
//            return new ObjResponse(Message.SUCCESS_CODE, Message.SUCCESS_MESSAGE);
//        } catch (Exception e) {
//            return new ObjResponse(Message.CONFLIT_CODE, Message.CONFLIT_MESSAGE);
//        }
//    }
}
