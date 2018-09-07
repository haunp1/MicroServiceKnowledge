package vn.com.knowledge.endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vn.com.knowledge.common.ObjResponse;
import vn.com.knowledge.config.Constants;
import vn.com.knowledge.dto.CategoryDTO;
import vn.com.knowledge.service.CategoryService;

import java.util.List;


/**
 * @author NhanVT3
 */

@RestController
@RequestMapping(path = Constants.CATEGORY_BASE_URL)
public class CategoryEndPoint {


    @Autowired
    private CategoryService categoryService;

    /**
     *
     * @return List {@link CategoryDTO}
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategoryDTO> findAll()
    {
        return categoryService.findAll();
    }

    /**
     * @return list Category
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE,params = {"offset", "isDeleted"})
    public List<CategoryDTO> findAll(@RequestParam (value = "isDeleted", defaultValue = "0") boolean isDeleted,@RequestParam("offset") int offset, @RequestParam(value = "limit") int limit,@RequestParam(value = "sort",defaultValue = "ASC")String sort)  {
        return categoryService.findAllCategory(isDeleted,offset,limit,sort);
    }

    /**
     *
     * @param id
     * @return CategoryDTO
     */
    @GetMapping(path=Constants.CATEGORY_OPERATE_BY_ID,produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoryDTO findByID(@PathVariable("id") Long id) {
        return categoryService.findById(id);
    }


    /**
     *
     * @param name
     * @return CategoryDTO
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE,params = {"name"})
    public CategoryDTO findByName(@RequestParam("name") String name) {
        return categoryService.findByNameLike(name);
    }

    /**
     * @param dto
     * @return ObjResponse
     */

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ObjResponse add(@RequestBody CategoryDTO dto) {
        return categoryService.add(dto);
    }

    /**
     *
     * @param id
     * @return ObjResponse
     */
    @DeleteMapping(path=Constants.CATEGORY_OPERATE_BY_ID,produces = MediaType.APPLICATION_JSON_VALUE)
    public ObjResponse deleteById(@PathVariable("id") Long id) {

        return categoryService.deleteById(id);
    }



}
