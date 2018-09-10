package vn.com.knowledge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import vn.com.knowledge.common.Message;
import vn.com.knowledge.converter.CategoryConverter;
import vn.com.knowledge.dto.CategoryDTO;
import vn.com.knowledge.dto.ResponseModal;
import vn.com.knowledge.entity.CategoryEntity;
import vn.com.knowledge.exception.BadRequestException;
import vn.com.knowledge.repository.CategoryRepository;
import vn.com.knowledge.service.CategoryService;

import java.util.List;

/**
 * @author NhanVT3
 */

@Service("categoryService")
@ComponentScan(value = "vn.com.knowledge")
public class CategoryServiceImpl implements CategoryService {
    @Override
    public ResponseModal findAllCategory(int offSet, int limit, String sort) {
        return null;
    }

    @Override
    public ResponseModal findByNameLike(String name) {
        return null;
    }

    @Override
    public ResponseModal add(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public ResponseModal update(CategoryDTO categoryDTO, Long id) {
        return null;
    }

    @Override
    public ResponseModal findAll() {
        return null;
    }

    @Override
    public ResponseModal findById(Long id) {
        return null;
    }

    @Override
    public ResponseModal deleteById(Long id) {
        return null;
    }


//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    @Autowired
//    private CategoryConverter categoryConverter;
//
//
//    @Override
//    public ResponseModal add(CategoryDTO categoryDTO) {
//        ResponseModal responseModal = new ResponseModal();
//        CategoryEntity entity = categoryConverter.convertToEntity(categoryDTO);
//        if (entity == null) {
//            responseModal.setMsg(Message.CATEGORY_NOT_FOUND);
//            responseModal.setSuccessful(false);
//            return responseModal;
//        } else {
//            categoryRepository.save(entity);
//            responseModal.setMsg(Message.SUCCESSFUL);
//            responseModal.setSuccessful(true);
//            return responseModal;
//        }
//
//    }
//
//    @Override
//    public ResponseModal update(Long id, CategoryDTO dto) {
//        dto.setName(dto.getName().trim());
//        ResponseModal responseModal = new ResponseModal();
//        CategoryEntity entity = categoryRepository.findById(id).get();
//        if (entity == null) {
//            responseModal.setMsg(Message.CATEGORY_NOT_FOUND);
//            responseModal.setSuccessful(false);
//            return responseModal;
//        }
//        try {
//            entity = categoryConverter.convertToEntity(dto);
//            responseModal.setData(categoryConverter.convertToDTO(categoryRepository.saveAndFlush(entity)));
//        } catch (DataIntegrityViolationException e) {
//            throw new BadRequestException(Message.DUPLICATE_CATEGORY_NAME);
//        } catch (Exception e) {
//            throw new BadRequestException(Message.DATA_INCORRECT);
//        }
//        return responseModal;
//    }
//
//    @Override
//    public ResponseModal findAll() {
//        ResponseModal responseModal = new ResponseModal();
//        List<CategoryEntity> categoryDTOS = categoryRepository.findAll();
//        responseModal.setData(categoryDTOS);
//        return responseModal;
//    }
//
//    @Override
//    public ResponseModal findById(Long id) {
//        ResponseModal responseModal = new ResponseModal();
//        CategoryEntity entity = categoryRepository.findById(id).get();
//        if (entity == null) {
//            responseModal.setData(entity);
//            responseModal.setMsg(Message.SUCCESSFUL);
//            return responseModal;
//        } else {
//            responseModal.setMsg(Message.CATEGORY_NOT_FOUND);
//            return responseModal;
//        }
//    }
//
//    @Override
//    public ResponseModal deleteById(Long id) {
//        ResponseModal responseModal = new ResponseModal();
//        CategoryEntity entity = categoryRepository.findById(id).get();
//        if (entity == null) {
//            responseModal.setData(entity);
//            responseModal.setMsg(Message.SUCCESSFUL);
//            categoryRepository.deleteById(id);
//            return responseModal;
//        } else {
//            responseModal.setMsg(Message.CATEGORY_NOT_FOUND);
//            return responseModal;
//        }
//    }
//
//
//    @Override
//    public ResponseModal findAllCategory(int offSet, int limit, String sort) {
//        return null;
//    }
//
//    @Override
//    public ResponseModal findByNameLike(String name) {
//        return null;
//    }
// -------------------------------------- older
//    /**
//     * @param categoryDTO
//     * @return CategoryDTO
//     */
//    @Override
//    public ResponseModal addOrUpdate(CategoryDTO categoryDTO) {
//        CategoryEntity entity = categoryConverter.convertToEntity(categoryDTO);
//        return categoryConverter.convertToDTO(categoryDAO.addOrUpdate(entity));
//
//    }
//
//    @Override
//    public ResponseModal update(CategoryDTO categoryDTO) {
//        return null;
//    }
//
//    /**
//     * @param categoryDTO
//     * @return ObjResponse
//     */
//    @Override
//    public ObjResponse add(CategoryDTO categoryDTO) {
//        CategoryEntity entity = categoryConverter.convertToEntity(categoryDTO);
//        try {
//            categoryDAO.add(entity);
//            return new ObjResponse(Message.SUCCESS_CODE, Message.SUCCESS_MESSAGE);
//        } catch (Exception e) {
//            return new ObjResponse(Message.CONFLIT_CODE, Message.CONFLIT_MESSAGE);
//        }
//    }
//
//    /**
//     * @return List CategoryDTO
//     */
//    @Override
//    public List<CategoryDTO> findAll() {
//        return categoryConverter.convertEntitiesToDTOs(categoryDAO.findAll());
//    }
//
//    /**
//     * @param id
//     * @return CategoryDTO
//     */
//    @Override
//    public Ob findById(Long id) {
//        if (id == null) {
//            return new CategoryDTO();
//        }
//        return categoryConverter.convertToDTO(categoryDAO.findById(id).orElse(new CategoryEntity()));
//    }
//
//    /**
//     * @param id
//     * @return ObjResponse
//     */
//    @Override
//    public ObjResponse deleteById(Long id) {
//        CategoryDTO categoryDTO = findById(id);
//        if (categoryDTO.getId() != 0 && categoryDTO.isDeleted() != true) {
//            categoryDTO.setDeleted(true);
//            categoryDAO.addOrUpdate(categoryConverter.convertToEntity(categoryDTO));
//            return new ObjResponse(Message.SUCCESS_CODE, Message.SUCCESS_MESSAGE);
//        }
//        return new ObjResponse(Message.FIND_NOT_ENTITY_CODE, Message.FIND_NOT_ENTITY_MESSAGE);
//    }
//
//    /**
//     * @param isDeleted
//     * @param offSet
//     * @param limit
//     * @param sort
//     * @return List CategoryDTO
//     */
//    @Override
//    public List<CategoryDTO> findCategoryExist(boolean isDeleted, int offSet, int limit, String sort) {
//        if (sort != null) {
//            Sort.Direction direction = Sort.Direction.ASC;
//            if (sort.equalsIgnoreCase("DESC")) {
//                direction = Sort.Direction.DESC;
//            }
//            return categoryConverter.convertEntitiesToDTOs(categoryDAO.findByIsDeleted(isDeleted, PageRequest.of(offSet, limit, direction, "name")).getContent());
//        }
//
//        return categoryConverter.convertEntitiesToDTOs(categoryDAO.findByIsDeleted(isDeleted, PageRequest.of(offSet, limit)).getContent());
//    }
//
//    /**
//     * @param name
//     * @return CategoryDTO
//     */
//    @Override
//    public CategoryDTO findByNameLike(String name) {
//        if (name == null) {
//            return new CategoryDTO();
//        }
//        return categoryConverter.convertToDTO(categoryDAO.findByNameLike(name).orElse(new CategoryEntity()));
//    }

}
