package vn.com.knowledge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import vn.com.knowledge.common.Message;
import vn.com.knowledge.converter.ImageConverter;
import vn.com.knowledge.dto.ImageDTO;
import vn.com.knowledge.dto.ResponseModal;
import vn.com.knowledge.entity.ImageEntity;
import vn.com.knowledge.exception.BadRequestException;
import vn.com.knowledge.repository.ImageRepository;
import vn.com.knowledge.service.ImageService;

import java.util.List;


//@Service("imageService")
//@ComponentScan(value = "vn.com.knowledge")
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private ImageConverter imageConverter;

    @Override
    public ResponseModal add(ImageDTO imageDTO) {
        ResponseModal responseModal1 = new ResponseModal();
        ImageEntity imageEntity = imageConverter.convertToEntity(imageDTO);
        if (imageEntity == null){
            responseModal1.setMsg(Message.CATEGORY_NOT_FOUND);
            responseModal1.setSuccessful(false);
            return responseModal1;
        }
        else{
            imageRepository.save(imageEntity);
            responseModal1.setMsg(Message.SUCCESSFUL);
            responseModal1.setSuccessful(true);
            return responseModal1;
        }
    }

    @Override
    public ResponseModal update(ImageDTO imageDTO,Long id ) {
        imageDTO.setName(imageDTO.getName().trim());
        ResponseModal responseModal = new ResponseModal();
        ImageEntity imageEntity = imageRepository.findById(id).get();
        if (imageEntity == null){
            responseModal.setMsg(Message.CATEGORY_NOT_FOUND);
            responseModal.setSuccessful(false);
            return responseModal;
        }
        else {
            try {
                imageEntity = imageConverter.convertToEntity(imageDTO);
                responseModal.setData(imageConverter.convertToDTO(imageRepository.save(imageEntity)));

            }catch (DataIntegrityViolationException e){
                throw new BadRequestException(Message.DUPLICATE_CATEGORY_NAME);
            }catch (Exception e){
            throw new BadRequestException(Message.DATA_INCORRECT);
            }
            return responseModal;
        }
    }


    @Override
    public ResponseModal findAll() {
        ResponseModal responseModal = new ResponseModal();
        List<ImageEntity> imageEntities = imageRepository.findAll();
        responseModal.setData(imageEntities);
//        responseModal.setSuccessful(true);
//        responseModal.setMsg(Message.SUCCESSFUL);
        return responseModal;

//    @Override
//    public ResponseModal addOrUpdate(ImageDTO imageDTO) {
//        ResponseModal responseModal= new ResponseModal();
//        ImageEntity entity = imageConverter.convertToEntity(imageDTO);
//        if(entity == null)
//        {
//            responseModal.setSuccessful(false);
//            responseModal.setMsg(Message.CATEGORY_NOT_FOUND);
//            return responseModal;
//        }
//        else{
//            responseModal.setData(entity);
//            responseModal.setMsg(Message.SUCCESSFUL);
//            return responseModal;
//
//        }
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
