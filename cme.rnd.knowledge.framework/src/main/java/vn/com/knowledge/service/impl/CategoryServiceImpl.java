package vn.com.knowledge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.com.knowledge.common.Message;
import vn.com.knowledge.common.ObjResponse;
import vn.com.knowledge.converter.CategoryConverter;
import vn.com.knowledge.dao.CategoryDAO;
import vn.com.knowledge.dto.CategoryDTO;
import vn.com.knowledge.entity.CategoryEntity;
import vn.com.knowledge.service.CategoryService;

import java.util.List;

/**
 * @author NhanVT3
 */

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    @Autowired
    private CategoryConverter categoryConverter;

    /**
     *
     * @param categoryDTO
     * @return CategoryDTO
     */
    @Override
    public CategoryDTO addOrUpdate(CategoryDTO categoryDTO) {
        CategoryEntity entity = categoryConverter.convertToEntity(categoryDTO);
        return categoryConverter.convertToDTO(categoryDAO.addOrUpdate(entity));

    }

    /**
     *
     * @param categoryDTO
     * @return ObjResponse
     *
     */
    @Override
    public ObjResponse add(CategoryDTO categoryDTO) {
        CategoryEntity entity = categoryConverter.convertToEntity(categoryDTO);
        try{
            categoryDAO.add(entity);
            return new ObjResponse(Message.SUCCESS_CODE,Message.SUCCESS_MESSAGE);
        }catch (Exception e)
        {
            return new ObjResponse(Message.CONFLIT_CODE,Message.CONFLIT_MESSAGE);
        }
    }

    /**
     *
     * @return List CategoryDTO
     */
    @Override
    public List<CategoryDTO> findAll() {

        return categoryConverter.convertEntitiesToDTOs(categoryDAO.findAll());
    }

    /**
     *
     * @param id
     * @return CategoryDTO
     */
    @Override
    public CategoryDTO findById(Long id) {
        if (id == null) {
            return new CategoryDTO();
        }
        return categoryConverter.convertToDTO(categoryDAO.findById(id).orElse(new CategoryEntity()));
    }

    /**
     *
     * @param id
     * @return ObjResponse
     */
    @Override
    public ObjResponse deleteById(Long id) {
        CategoryDTO categoryDTO = findById(id);
        if (categoryDTO.getId() != 0 && categoryDTO.isDeleted() != true) {
            categoryDTO.setDeleted(true);
            categoryDAO.addOrUpdate(categoryConverter.convertToEntity(categoryDTO));
            return new ObjResponse(Message.SUCCESS_CODE, Message.SUCCESS_MESSAGE);
        }
        return new ObjResponse(Message.FIND_NOT_ENTITY_CODE, Message.FIND_NOT_ENTITY_MESSAGE);
    }

    /**
     *
     * @param isDeleted
     * @param offSet
     * @param limit
     * @param sort
     * @return List CategoryDTO
     */
    @Override
    public List<CategoryDTO> findAllCategory(boolean isDeleted, int offSet, int limit, String sort) {
        if (sort != null) {
            Sort.Direction direction = Sort.Direction.ASC;
            if (sort.equalsIgnoreCase("DESC")) {
                direction = Sort.Direction.DESC;
            }
            return categoryConverter.convertEntitiesToDTOs(categoryDAO.findByIsDeleted(isDeleted, PageRequest.of(offSet, limit, direction, "name")).getContent());
        }

        return categoryConverter.convertEntitiesToDTOs(categoryDAO.findByIsDeleted(isDeleted, PageRequest.of(offSet, limit)).getContent());
    }

    /**
     *
     * @param name
     * @return CategoryDTO
     */
    @Override
    public CategoryDTO findByNameLike(String name) {
        if (name == null) {
            return new CategoryDTO();
        }
        return categoryConverter.convertToDTO(categoryDAO.findByNameLike(name).orElse(new CategoryEntity()));
    }

}
