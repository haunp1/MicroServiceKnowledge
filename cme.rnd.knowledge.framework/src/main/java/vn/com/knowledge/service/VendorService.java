package vn.com.knowledge.service;

import vn.com.knowledge.dto.VendorDTO;
import vn.com.knowledge.common.ObjResponse;

import java.util.List;

public interface VendorService extends SuperService<VendorDTO, Long> {
//    List<VendorDTO> findAllVendor(boolean isDeleted, int offSet, int limit, String sort);
    VendorDTO findByNameLike(String name);

    ObjResponse add(VendorDTO categoryDTO);
}
