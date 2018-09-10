package vn.com.knowledge.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.knowledge.entity.CategoryEntity;

import java.util.Optional;

/**
 * @author NhanVT3
 */


public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

//    Optional<CategoryEntity> findByNameLike(String name);
//
//    Page<CategoryEntity> findByNameAndIsDeleted(String name, boolean isDeleted, Pageable pageable);


}
