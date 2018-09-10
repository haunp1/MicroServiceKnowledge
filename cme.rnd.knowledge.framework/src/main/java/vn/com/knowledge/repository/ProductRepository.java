package vn.com.knowledge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.knowledge.entity.ProductEntity;

/**
 * @author ThanhVQ
 */
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
