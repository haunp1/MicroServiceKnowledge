package vn.com.knowledge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.com.knowledge.entity.VendorEntity;

import java.util.Optional;

public interface VendorRepository extends JpaRepository<VendorEntity, Long> {

    Optional<VendorEntity> findByNameLike(String name);
}
