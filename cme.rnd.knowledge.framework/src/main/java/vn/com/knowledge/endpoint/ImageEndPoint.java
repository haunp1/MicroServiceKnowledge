package vn.com.knowledge.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vn.com.knowledge.common.EndPoint;
import vn.com.knowledge.dto.ResponseModal;
import vn.com.knowledge.service.ImageService;


@RestController
@RequestMapping(path = EndPoint.IMAGE_BASE_URL)
public class ImageEndPoint {

    @Autowired
    private ImageService imageService;
    @GetMapping(path =EndPoint.IMAGE_BASE_URL,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseModal findAll(){
        return imageService.findAll();
    }

//        @GetMapping(path = EndPoint.IMAGE_OPERATE_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
//        public ResponseModal findByID(@PathVariable("id") Long id) {
//            return imageService.findById(id);
//        }
//
////    @GetMapping(path =EndPoint.IMAGE_BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
////    public ResponseModal findAll(){
////        return imageService.findAll();
////    }

//
//        @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//        public ResponseModal add(ImageDTO imageDTO){
//            return imageService.add(imageDTO);
//    //        return imageService.addOrUpdate(dto);
//        }
//
//    @PostMapping(path = EndPoint.IMAGE_OPERATE_BY_ID, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseModal update(@RequestBody Long id, ImageDTO imageDTO){
//        return imageService.update( imageDTO,id);
//    }

//    @GetMapping(path = EndPoint.IMAGE_BASE_URL)
//    public ResponseModal getAll(){
//        return imageService.findAll();
//    }
}
