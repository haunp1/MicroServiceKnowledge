package vn.com.knowledge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.knowledge.common.Message;
import vn.com.knowledge.common.ObjResponse;
import vn.com.knowledge.converter.ProductConverter;
//import vn.com.knowledge.dao.ProductDAO;
import vn.com.knowledge.dto.ProductDTO;
import vn.com.knowledge.dto.ResponseModal;
import vn.com.knowledge.entity.ProductEntity;
import vn.com.knowledge.service.ProductService;

import java.util.List;

/**
 * @author ThanhVQ
 */

@Service("productService")
public class ProductServiceImpl implements ProductService {
//    @Override
//    public ObjResponse add(ProductDTO productDTO) {
//        return null;
//    }

    @Override
    public ResponseModal add(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ResponseModal update(ProductDTO productDTO, Long id) {
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
//
//    @Autowired
//    private ProductDAO productDAO;
//
//    @Autowired
//    private ProductConverter productConverter;
//
//    @Override
//    public ObjResponse add(ProductDTO productDTO) {
//        ProductEntity entity = productConverter.convertToEntity(productDTO);
//        try {
//            productDAO.add(entity);
//            return new ObjResponse(Message.SUCCESS_CODE, Message.SUCCESS_MESSAGE);
//        } catch (Exception e) {
//            return new ObjResponse(Message.CONFLIT_CODE, Message.CONFLIT_MESSAGE);
//        }
//    }
//
//
//    @Override
//    public ProductDTO addOrUpdate(ProductDTO productDTO) {
//        return null;
//    }
//
//    @Override
//    public List<ProductDTO> findAll() {
//        return null;
//    }
//
//    @Override
//    public ProductDTO findById(Long id) {
//        return null;
//    }
//
//    @Override
//    public ObjResponse deleteById(Long id) {
//        return null;
//    }
}
