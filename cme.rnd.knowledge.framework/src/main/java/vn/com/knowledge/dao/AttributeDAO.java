package vn.com.knowledge.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.com.knowledge.entity.AttributeEntity;

import java.util.Optional;

/**
 * @author ThanhVQ
 */
public interface AttributeDAO extends SuperDAO<AttributeEntity, Long>{
    Page<AttributeEntity> findByIsDeleted(Boolean isDeleted, Pageable pageable);
    Optional<AttributeEntity> findByName(String name);
    Page<AttributeEntity> findByIsDeletedAndNameContaining(Boolean isDeleted, String name, Pageable pageable);
    void add(AttributeEntity attributeEntity);
}