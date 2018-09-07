package vn.com.knowledge.converter;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import vn.com.knowledge.dto.AttributeDTO;
import vn.com.knowledge.entity.AttributeEntity;

import java.util.LinkedList;
import java.util.List;


/**
 * @author ThanhVQ
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AttributeConverter.class, loader = AnnotationConfigContextLoader.class)
@ComponentScan(value = "vn.com.knowledge")
@EnableAutoConfiguration
public class AttributeConverterTest extends TestCase {

    @Autowired
    private AttributeConverter attributeConverter;

    @Test
    public void testConvertEntitiesToDTOs() {
        List<AttributeEntity> attributeEntities = new LinkedList<>();
        AttributeEntity entity = new AttributeEntity();
        entity.setName("test");
        entity.setDescription("test Converter Entities to DTOs");
        AttributeEntity entity1 = new AttributeEntity();
        entity.setName("test1");
        entity.setDescription("test Converter Entities to DTOs 1");
        attributeEntities.add(entity);
        attributeEntities.add(entity1);
        List<AttributeDTO> AttributeDTOS = attributeConverter.convertEntitiesToDTOs(attributeEntities);
        assertEquals(attributeEntities.get(1).getName(), AttributeDTOS.get(1).getName());
    }

    @Test
    public void testConvertToDTO() {
        AttributeEntity entity = new AttributeEntity();
        entity.setName("test");
        entity.setDescription("test Converter Entity to DTO");
        AttributeDTO AttributeDTO = attributeConverter.convertToDTO(entity);
        assertEquals(entity.getName(), AttributeDTO.getName());
    }

    @Test
    public void testConvertToEntity() {
        AttributeDTO AttributeDTO = new AttributeDTO();
        AttributeDTO.setName("test");
        AttributeDTO.setDescription("Test Convert DTO to Entity");
        AttributeEntity AttributeEntity = attributeConverter.convertToEntity(AttributeDTO);
        assertEquals(AttributeDTO.getName(), AttributeEntity.getName());
    }
}