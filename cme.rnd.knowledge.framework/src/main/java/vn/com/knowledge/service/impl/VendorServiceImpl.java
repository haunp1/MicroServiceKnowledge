package vn.com.knowledge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.knowledge.common.Message;
import vn.com.knowledge.common.ObjResponse;
import vn.com.knowledge.converter.VendorConverter;
import vn.com.knowledge.dao.VendorDAO;
import vn.com.knowledge.dto.VendorDTO;
import vn.com.knowledge.entity.VendorEntity;
import vn.com.knowledge.service.VendorService;

/**
 * @author LocLD1
 *
 */

@Service("vendorService")
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDAO vendorDAO;

	@Autowired
	private VendorConverter vendorConverter;


	@Override
	public VendorDTO addOrUpdate(VendorDTO dto) {
		VendorEntity entity = vendorConverter.convertToEntity(dto);
		return vendorConverter.convertToDTO(vendorDAO.addOrUpdate(entity));
	}

	@Override
	public ObjResponse add(VendorDTO vendorDTO){
		VendorEntity entity = vendorConverter.convertToEntity(vendorDTO);
		try{
			vendorDAO.add(entity);
			return new ObjResponse(Message.SUCCESS_CODE,Message.SUCCESS_MESSAGE);
		}catch (Exception e)
		{
			return new ObjResponse(Message.CONFLIT_CODE,Message.CONFLIT_MESSAGE);
		}
	}

	@Override
	public List<VendorDTO> findAll() {
		return vendorConverter.convertEntitiesToDTOs(vendorDAO.findAll());
	}

	@Override
	public ObjResponse deleteById(Long id) {
		return null;
	}

	@Override
	public VendorDTO findById(Long id) {
		if (id == null) {
			return new VendorDTO();
		}
		return vendorConverter.convertToDTO(vendorDAO.findById(id).orElse(new VendorEntity()));
	}
	@Override
	public VendorDTO findByNameLike(String name) {
		if (name == null) {
			return new VendorDTO();
		}
		return vendorConverter.convertToDTO(vendorDAO.findByNameLike(name).orElse(new VendorEntity()));
	}
//	@Override
//	public ObjResponse deleteById(Long id) {
//		VendorDTO vendorDTO = findById(id);
//		if (vendorDTO.getId() != 0 && vendorDTO.isDeleted() != true) {
//			vendorDAO.setDeleted(true);
//			vendorDAO.addOrUpdate(vendorConverter.convertToEntity(vendorDTO));
//			return new ObjResponse(Message.SUCCESS_CODE, Message.SUCCESS_MESSAGE);
//		}
//		return new ObjResponse(Message.FIND_NOT_ENTITY_CODE, Message.FIND_NOT_ENTITY_MESSAGE);
}
