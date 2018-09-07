package vn.com.knowledge.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.com.knowledge.entity.CategoryEntity;

import java.util.Optional;

/**
 * @author NhanVT3
 */

public interface CategoryDAO extends SuperDAO<CategoryEntity, Long> {
    Page<CategoryEntity> findByIsDeleted(Boolean isDeleted, Pageable pageable);
    Optional<CategoryEntity> findByNameLike(String name);
    void add(CategoryEntity categoryEntity);
}
