package vn.com.knowledge.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import vn.com.knowledge.dto.ImageDTO;
import vn.com.knowledge.dto.ResponseModal;

@Service("imageService")
@ComponentScan(value = "vn.com.knowledge")
public interface ImageService extends SuperService<ImageDTO, Long>{
    ResponseModal findAll();
    ResponseModal add(ImageDTO imageDTO);
    ResponseModal update(ImageDTO imageDTO,Long id);
}
