package vn.com.knowledge.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.knowledge.common.ObjResponse;
import vn.com.knowledge.config.Constants;
import vn.com.knowledge.dto.VendorDTO;
import vn.com.knowledge.service.VendorService;

/**
 * @author LocLD1
 *
 */
@RestController
@RequestMapping(path = Constants.VENDOR_BASE_URL)
public class VendorEndPoint {

	@Autowired
	private VendorService vendorService;

	@GetMapping(path=Constants.VENDOR_OPERATE_BY_ID,produces = MediaType.APPLICATION_JSON_VALUE)
	public VendorDTO findByID(@PathVariable("id") Long id) {		
		return vendorService.findById(id);
	}
	
	/**
	 * @return list Vendor
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VendorDTO> findAll() {
		return vendorService.findAll();
	}

	/**
	 * @param dto
	 * @return
	 */
//	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public VendorDTO addOrUpdate(@RequestBody VendorDTO dto) {
//		return vendorService.addOrUpdate(dto);
//	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ObjResponse add(@RequestBody VendorDTO dto) {

		return vendorService.add(dto);
	}
}
