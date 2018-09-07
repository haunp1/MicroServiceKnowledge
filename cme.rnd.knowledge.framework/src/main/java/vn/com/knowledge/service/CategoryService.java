package vn.com.knowledge.service;

import vn.com.knowledge.common.ObjResponse;
import vn.com.knowledge.dto.CategoryDTO;

import java.util.List;

/**
 * @author NhanVT3
 */

public interface  CategoryService extends SuperService<CategoryDTO, Long> {
    List<CategoryDTO> findAllCategory(boolean isDeleted, int offSet, int limit, String sort);
    CategoryDTO findByNameLike(String name);
    ObjResponse add(CategoryDTO categoryDTO);

}
