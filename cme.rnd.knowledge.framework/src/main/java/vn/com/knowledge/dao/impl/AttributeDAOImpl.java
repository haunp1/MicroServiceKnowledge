package vn.com.knowledge.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.com.knowledge.dao.AttributeDAO;
import vn.com.knowledge.entity.AttributeEntity;
import vn.com.knowledge.repository.AttributeRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author ThanhVQ
 */

@Repository("attributeDAO")
@Transactional
public class AttributeDAOImpl implements AttributeDAO {

    @Autowired
    private AttributeRepository attributeRepository;


    /**
     * Add or update entity
     *
     * @param attributeEntity
     * @return AttributeEntity
     */
    @Override
    public AttributeEntity addOrUpdate(AttributeEntity attributeEntity) {
        return attributeRepository.saveAndFlush(attributeEntity);
    }

    /**
     * Seletect all entity
     *
     * @return List<AttributeEntity>
     */
    @Override
    public List<AttributeEntity> findAll() {
        return attributeRepository.findAll();
    }

    /**
     * Delete entity by using id
     *
     * @param id
     */
    @Override
    public void deleteById(Long id) {
        attributeRepository.deleteById(id);
    }

    /**
     * Find entity by using id
     *
     * @param id
     * @return Optional<AttributeEntity>
     */
    @Override
    public Optional<AttributeEntity> findById(Long id) {
        return attributeRepository.findById(id);
    }

    @Override
    public Page<AttributeEntity> findByIsDeleted(Boolean isDeleted, Pageable pageable) {
        return attributeRepository.findByIsDeleted(isDeleted, pageable);
    }

    @Override
    public Optional<AttributeEntity> findByName(String name) {
        return attributeRepository.findByName(name);
    }

    @Override
    public Page<AttributeEntity> findByIsDeletedAndNameContaining(Boolean isDeleted, String name, Pageable pageable) {
        return attributeRepository.findAllByIsDeletedAndNameContaining(isDeleted, name, pageable);
    }

    @Override
    public void add(AttributeEntity attributeEntity) {
        attributeRepository.saveAndFlush(attributeEntity);
    }

}