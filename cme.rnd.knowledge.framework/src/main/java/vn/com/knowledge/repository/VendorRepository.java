package vn.com.knowledge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.knowledge.entity.VendorEntity;
	
public interface VendorRepository extends JpaRepository<VendorEntity, Long> {

}
