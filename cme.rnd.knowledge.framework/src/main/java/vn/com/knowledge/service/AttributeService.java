package vn.com.knowledge.service;

import vn.com.knowledge.common.ObjResponse;
import vn.com.knowledge.dto.AttributeDTO;

import java.util.List;

/**
 * @author ThanhVQ
 */
public interface AttributeService extends SuperService<AttributeDTO, Long> {

    List<AttributeDTO> findAllCheckIsDeleted(boolean isDeleted, int offSet, int limit, String soft);
    AttributeDTO findByName(String name);
    List<AttributeDTO> findAllCheckIsDeletedAndNameContaining(boolean isDeleted, String name, int offSet, int limit, String soft);
    ObjResponse add(AttributeDTO attributeDTO);
}
