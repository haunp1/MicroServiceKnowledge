package vn.com.knowledge.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.knowledge.common.ObjResponse;
//import vn.com.knowledge.config.Constants;
import vn.com.knowledge.dto.ProductDTO;
import vn.com.knowledge.service.ProductService;

/**
 * @author ThanhVQ
 */

@RestController
//@RequestMapping(path = Constants.PRODUCT_BASE_URL)
public class ProductEndPoint {

//    @Autowired
//    private ProductService productService;
//
//
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ObjResponse addOrUpdate(@RequestBody ProductDTO dto) {
//        return productService.add(dto);
//    }
}

