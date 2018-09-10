package vn.com.knowledge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.knowledge.entity.ImageEntity;

import java.util.List;
import java.util.Optional;
public interface ImageRepository extends JpaRepository<ImageEntity, Long> {

    @Override
    Optional<ImageEntity> findById(Long aLong);
    List<ImageEntity> findAll();

}
