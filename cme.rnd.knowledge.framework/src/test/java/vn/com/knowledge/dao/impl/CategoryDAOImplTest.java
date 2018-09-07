package vn.com.knowledge.dao.impl;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.Transactional;
import vn.com.knowledge.entity.CategoryEntity;
import vn.com.knowledge.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

/**
 * @author NhanVT3
 */
@Transactional
@RunWith(MockitoJUnitRunner.class)
public class CategoryDAOImplTest extends TestCase {
    private final int PAGE_NUMBER = 1;
    private final int PAGE_SIZE = 5;
    Pageable pageable;


    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryDAOImpl categoryDAO ;

    @Before
    public void setUp() {
        Sort sort = new Sort(Sort.Direction.ASC,"name");
        pageable = PageRequest.of(PAGE_NUMBER,PAGE_SIZE,sort);
        categoryRepository = Mockito.mock(CategoryRepository.class);
        categoryDAO = Mockito.mock(CategoryDAOImpl.class);
    }



    @Test
    public void testAddOrUpdate() {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName("Vo Tai Nhan");
        categoryEntity.setDescription("Demo Unit Test");
        when(categoryDAO.addOrUpdate(categoryEntity)).thenReturn(categoryEntity);
        assertEquals("Vo Tai Nhan",categoryEntity.getName());
    }

    @Test
    public void testFindAll() {
        List<CategoryEntity> categoryEntities = new ArrayList<>();
        //given
        CategoryEntity entity = new CategoryEntity();
        entity.setName("Nguyen Van A");
        entity.setDescription("Demo Unit Test");
        categoryEntities.add(entity);
        CategoryEntity entity1 = new CategoryEntity();
        entity1.setName("Nguyen Van B");
        entity.setDescription("Demo Unit Test 1");
        categoryEntities.add(entity1);
        when(categoryDAO.findAll()).thenReturn(categoryEntities);

        assertEquals(2,categoryEntities.size());
        assertEquals(entity,categoryEntities.get(0));

    }


    @Test
    public void testFindById() {
        List<CategoryEntity> categoryEntities = new ArrayList<>();
        //given
        CategoryEntity entity = new CategoryEntity();
        entity.setName("Nguyen Van A");
        entity.setDescription("Demo Unit Test");
        categoryEntities.add(entity);
        CategoryEntity entity1 = new CategoryEntity();
        entity1.setName("Nguyen Van B");
        entity.setDescription("Demo Unit Test 1");
        categoryEntities.add(entity1);
        Mockito.when(categoryDAO.findById(Long.valueOf(0))).thenReturn(Optional.of(entity));
        assertEquals("Nguyen Van A",entity.getName());
    }

    @Test
    public void testFindByIsDeleted() {

        List<CategoryEntity> categoryEntities = new ArrayList<>();
        Page<CategoryEntity> categoryEntityPage = new PageImpl<>(categoryEntities);
        Mockito.when(categoryDAO.findByIsDeleted(false,pageable)).thenReturn(categoryEntityPage);
    }

    @Test
    public void testFindByNameLike() {
        List<CategoryEntity> categoryEntities = new ArrayList<>();
        //given
        CategoryEntity entity = new CategoryEntity();
        entity.setName("Nguyen Van A");
        entity.setDescription("Demo Unit Test");
        categoryEntities.add(entity);
        CategoryEntity entity1 = new CategoryEntity();
        entity1.setName("Nguyen Van B");
        entity.setDescription("Demo Unit Test 1");
        categoryEntities.add(entity1);
        Mockito.when(categoryDAO.findByNameLike("Nguyen Van A")).thenReturn(Optional.of(entity));
        assertEquals("Nguyen Van A",entity.getName());
    }

}