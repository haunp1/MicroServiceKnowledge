package vn.com.knowledge.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.com.knowledge.entity.VendorEntity;

import java.util.Optional;

/**
 * @author LocLD1
 *
 */
public interface VendorDAO extends SuperDAO<VendorEntity, Long> {
//    Page<VendorEntity> findByIsDeleted(Boolean isDeleted, Pageable pageable);
    Optional<VendorEntity> findByNameLike(String name);
    void add(VendorEntity vendorEntity);
}
