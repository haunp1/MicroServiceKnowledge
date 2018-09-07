package vn.com.knowledge.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.com.knowledge.dao.CategoryDAO;
import vn.com.knowledge.entity.CategoryEntity;
import vn.com.knowledge.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author NhanVT3
 */

@Repository("categoryDAO")
@Transactional(readOnly = true)
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    CategoryRepository categoryRepository;

    /**
     * @param categoryEntity
     * @return CategoryEntity
     */
    @Override
    @Transactional
    public CategoryEntity addOrUpdate(CategoryEntity categoryEntity) {
        return categoryRepository.saveAndFlush(categoryEntity);
    }

    @Override
    public List<CategoryEntity> findAll() {

        return categoryRepository.findAll();
    }

    /**
     * @param id
     */
    @Override
    @Transactional
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }


    /**
     * @param id
     * @return Optional CategoryEntity
     */
    @Override
    @Transactional
    public Optional<CategoryEntity> findById(Long id) {
        return categoryRepository.findById(id);
    }


    @Override
    public Page<CategoryEntity> findByIsDeleted(Boolean isDeleted, Pageable pageable) {
        return categoryRepository.findByIsDeleted(isDeleted, pageable);
    }

    /**
     * @param name
     * @return CategoryEntity
     */
    @Override
    public Optional<CategoryEntity> findByNameLike(String name) {
        return categoryRepository.findByNameLike(name);
    }


    /**
     * @param categoryEntity
     */
    @Override
    @Transactional
    public void add(CategoryEntity categoryEntity) {
        categoryRepository.saveAndFlush(categoryEntity);
    }

}
