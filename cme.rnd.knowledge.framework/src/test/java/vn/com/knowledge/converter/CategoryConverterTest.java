package vn.com.knowledge.converter;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.Model;
import vn.com.knowledge.dto.CategoryDTO;
import vn.com.knowledge.entity.CategoryEntity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NhanVT3
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CategoryConverterTest.class, loader = AnnotationConfigContextLoader.class)
@ComponentScan(value = "vn.com.knowledge")
@EnableAutoConfiguration
public class CategoryConverterTest extends TestCase {


    @Autowired
    private CategoryConverter categoryConverter;




    @Test
    public void testConvertEntitiesToDTOs() {
        List<CategoryEntity> categoryEntities = new LinkedList<>();
        CategoryEntity entity = new CategoryEntity();
        entity.setName("test");
        entity.setDescription("test Converter Entities to DTOs");
        CategoryEntity entity1 = new CategoryEntity();
        entity.setName("test1");
        entity.setDescription("test Converter Entities to DTOs 1");
        categoryEntities.add(entity);
        categoryEntities.add(entity1);
        List<CategoryDTO> categoryDTOS = categoryConverter.convertEntitiesToDTOs(categoryEntities);
        assertEquals(categoryEntities.get(1).getName(),categoryDTOS.get(1).getName());

    }

    @Test
    public void testConvertToDTO() {
        CategoryEntity entity = new CategoryEntity();
        entity.setName("test");
        entity.setDescription("test Converter Entity to DTO");
        CategoryDTO categoryDTO = categoryConverter.convertToDTO(entity);
        assertEquals(entity.getName(),categoryDTO.getName());
    }

    @Test
    public void testConvertToEntity() {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName("test");
        categoryDTO.setDescription("Test Convert DTO to Entity");
        CategoryEntity categoryEntity = categoryConverter.convertToEntity(categoryDTO);
        assertEquals(categoryDTO.getName(),categoryEntity.getName());
    }
}