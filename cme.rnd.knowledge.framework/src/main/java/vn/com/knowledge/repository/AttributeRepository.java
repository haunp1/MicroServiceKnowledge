package vn.com.knowledge.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.knowledge.entity.AttributeEntity;

import java.util.Optional;

/**
 * @author ThanhVQ
 */
public interface AttributeRepository extends JpaRepository<AttributeEntity, Long> {

    Page<AttributeEntity> findByIsDeleted(Boolean isDeleted, Pageable pageable);
    Optional<AttributeEntity> findByName(String name);
    Page<AttributeEntity> findAllByIsDeletedAndNameContaining(Boolean isDeleted, String name, Pageable pageable);
    Page<AttributeEntity> findByNameContaining(String name, Pageable pageable);
}
