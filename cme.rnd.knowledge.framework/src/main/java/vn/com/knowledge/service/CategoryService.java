package vn.com.knowledge.service;

import vn.com.knowledge.dto.CategoryDTO;
import vn.com.knowledge.dto.ResponseModal;

/**
 * @author NhanVT3
 */

public interface  CategoryService extends SuperService<CategoryDTO, Long> {
    ResponseModal findAllCategory(int offSet, int limit, String sort);

    ResponseModal findByNameLike(String name);
}
