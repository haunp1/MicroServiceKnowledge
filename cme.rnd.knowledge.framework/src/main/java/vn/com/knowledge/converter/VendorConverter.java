package vn.com.knowledge.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.com.knowledge.dto.VendorDTO;
import vn.com.knowledge.entity.VendorEntity;

@Component("vendorConverter")
public class VendorConverter implements SuperConverter<VendorDTO, VendorEntity> {

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<VendorDTO> convertEntitiesToDTOs(List<VendorEntity> entities) {
		if (entities.isEmpty()) {
			return new ArrayList<>();
		}
		return entities.stream().map(entity -> convertToDTO(entity)).collect(Collectors.toList());
	}

	@Override
	public List<VendorEntity> convertDTOsToEntities(List<VendorDTO> dtos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VendorDTO convertToDTO(VendorEntity entity) {
		return modelMapper.map(entity, VendorDTO.class);
	}

	@Override
	public VendorEntity convertToEntity(VendorDTO dto) {
		return modelMapper.map(dto, VendorEntity.class);
	}

}
