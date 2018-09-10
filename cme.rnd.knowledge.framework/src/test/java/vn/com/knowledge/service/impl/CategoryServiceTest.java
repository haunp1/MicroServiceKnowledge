package vn.com.knowledge.service.impl;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import vn.com.knowledge.converter.CategoryConverter;
//import vn.com.knowledge.dao.CategoryDAO;
import vn.com.knowledge.dto.CategoryDTO;
import vn.com.knowledge.entity.CategoryEntity;

/**
 * @author NhanVT3
 */
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@ComponentScan(value = "vn.com.knowledge.converter")
@ContextConfiguration(classes = CategoryServiceTest.class, loader = AnnotationConfigContextLoader.class)
public class CategoryServiceTest extends TestCase {

//    @Mock
//    CategoryDAO categoryDAO;
//
//    @Autowired
//    @Qualifier("categoryConverter")
//    CategoryConverter categoryConverter;
//
//    @InjectMocks
//    CategoryServiceImpl categoryService;
//
//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testAddOrUpdate() {
//        CategoryEntity categoryEntity = new CategoryEntity();
//        categoryEntity.setName("Test");
//        categoryEntity.setDescription("Test Service");
//        Mockito.when(categoryDAO.addOrUpdate(categoryEntity)).thenReturn(categoryEntity);
//        CategoryDTO categoryDTO = categoryConverter.convertToDTO(categoryEntity);
//        CategoryDTO categoryDTOResult = categoryService.addOrUpdate(categoryDTO);
//        assertEquals("Test", categoryDTOResult.getName());
//    }
//
//    public void testAdd() {
//    }
//
//    public void testFindAll() {
//    }
//
//    public void testFindById() {
//    }
//
//    public void testDeleteById() {
//    }
//
//    public void testFindAllCategory() {
//    }
//
//    public void testFindByNameLike() {
//    }
}