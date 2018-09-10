package vn.com.knowledge.service.impl;

import org.springframework.stereotype.Service;
import vn.com.knowledge.dto.ResponseModal;
import vn.com.knowledge.dto.VendorDTO;
import vn.com.knowledge.service.VendorService;

/**
 * @author LocLD1
 */
@Service("vendorService")
public class VendorServiceImpl implements VendorService {


    @Override
    public ResponseModal add(VendorDTO vendorDTO) {
        return null;
    }

    @Override
    public ResponseModal update(VendorDTO vendorDTO, Long id) {
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
}
