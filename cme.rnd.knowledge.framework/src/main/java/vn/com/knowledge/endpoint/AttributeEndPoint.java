package vn.com.knowledge.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vn.com.knowledge.common.ObjResponse;
//import vn.com.knowledge.config.Constants;
import vn.com.knowledge.dto.AttributeDTO;
import vn.com.knowledge.service.AttributeService;

import java.util.List;

/**
 * @author ThanhVQ
 */

@RestController
//@RequestMapping(path = Constants.ATTRIBUTE_BASE_URL)
public class AttributeEndPoint {

//    @Autowired
//    private AttributeService attributeService;
//
//    /**
//     * Endpoint to find all entity
//     *
//     * @param offset
//     * @param limit
//     * @param isDeleted
//     * @param sort
//     * @return List<AttributeDTO>
//     */
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<AttributeDTO> findAll(@RequestParam(value = "offset", defaultValue = "0") int offset,
//                                      @RequestParam(value = "limit", defaultValue = "10") int limit,
//                                      @RequestParam(value = "isDeleted", defaultValue = "false") boolean isDeleted,
//                                      @RequestParam(value = "sort", required = false) String sort) {
//        return attributeService.findAllCheckIsDeleted(isDeleted, offset, limit, sort);
//    }
//
//    /**
//     * Endpoint to add or update entity
//     *
//     * @param dto
//     * @return AttributeDTO
//     */
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ObjResponse addOrUpdate(@RequestBody AttributeDTO dto) {
//        return attributeService.add(dto);
//    }
//
//    /**
//     * Endpoint to find entity by using id
//     *
//     * @return AttributeDTO
//     */
//    @GetMapping(value = Constants.ATTRIBUTE_OPERATE_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
//    public AttributeDTO findById(@PathVariable("id") Long id) {
//        return attributeService.findById(id);
//    }
//
//    /**
//     * Endpoint to find entity by using name
//     *
//     * @param name
//     * @return AttributeDTO
//     */
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = Constants.ATTRIBUTE_OPERATE_BY_NAME)
//    public AttributeDTO findByName(@PathVariable("name") String name) {
//        return attributeService.findByName(name);
//    }
//
//    /**
//     * Endpoint to delete entity by using id
//     *
//     * @return ObjResponse
//     */
//    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = Constants.ATTRIBUTE_OPERATE_BY_ID)
//    public ObjResponse deleteById(@PathVariable("id") Long id) {
//        return attributeService.deleteById(id);
//    }
//
//    /**
//     * Endpoint find entity by using name
//     *
//     * @param offset
//     * @param limit
//     * @param name
//     * @param isDeleted
//     * @param sort
//     * @return List<AttributeDTO>
//     */
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = Constants.ATTRIBUTE_OPERATE_BY_CONTAIN_NAME)
//    public List<AttributeDTO> findByIsDeletedAndNameLike(@RequestParam(value = "offset", defaultValue = "0") int offset,
//                                                         @RequestParam(value = "limit", defaultValue = "10") int limit,
//                                                         @RequestParam(value = "name") String name,
//                                                         @RequestParam(value = "isDeleted", defaultValue = "false") boolean isDeleted,
//                                                         @RequestParam(value = "sort", required = false) String sort) {
//        return attributeService.findAllCheckIsDeletedAndNameContaining(isDeleted, name, offset, limit, sort);
//    }
}
