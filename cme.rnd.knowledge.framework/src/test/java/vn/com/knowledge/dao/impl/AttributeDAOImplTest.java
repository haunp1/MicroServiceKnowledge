package vn.com.knowledge.dao.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.Transactional;
import vn.com.knowledge.entity.AttributeEntity;
import vn.com.knowledge.repository.AttributeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author ThanhVQ
 */

@Transactional
@RunWith(MockitoJUnitRunner.Silent.class)
public class AttributeDAOImplTest {
//    private final int PAGE_NUMBER = 1;
//    private final int PAGE_SIZE = 5;
//    Pageable pageable;
//
//
//
//    @Autowired
//    private AttributeRepository attributeRepository;
//
//    @Autowired
//    private AttributeDAOImpl attributeDAO ;
//
//    @Before
//    public void setUp() {
//        Sort sort = new Sort(Sort.Direction.ASC,"name");
//        pageable = PageRequest.of(PAGE_NUMBER,PAGE_SIZE,sort);
//        attributeRepository = Mockito.mock(AttributeRepository.class);
//        attributeDAO = Mockito.mock(AttributeDAOImpl.class);
//    }
//
//
//
//    @Test
//    public void testAddOrUpdate() {
//        AttributeEntity attributeEntity = new AttributeEntity();
//        attributeEntity.setName("Vo Quang Thanh");
//        attributeEntity.setDescription("Demo Unit Test");
//        when(attributeRepository.saveAndFlush(attributeEntity)).thenReturn(attributeEntity);
//        assertEquals("Vo Quang Thanh",attributeEntity.getName());
//    }
//
//    @Test
//    public void testFindAll() {
//        List<AttributeEntity> categoryEntities = new ArrayList<>();
//        //given
//        AttributeEntity entity = new AttributeEntity();
//        entity.setName("Nguyen Van A");
//        entity.setDescription("Demo Unit Test");
//        categoryEntities.add(entity);
//        AttributeEntity entity1 = new AttributeEntity();
//        entity1.setName("Nguyen Van B");
//        entity.setDescription("Demo Unit Test 1");
//        categoryEntities.add(entity1);
//        when(attributeRepository.findAll()).thenReturn(categoryEntities);
//
//        assertEquals(2,categoryEntities.size());
//        assertEquals(entity,categoryEntities.get(0));
//
//    }
//
//
//    @Test
//    public void testFindById() {
//        List<AttributeEntity> categoryEntities = new ArrayList<>();
//        //given
//        AttributeEntity entity = new AttributeEntity();
//        entity.setName("Nguyen Van A");
//        entity.setDescription("Demo Unit Test");
//        categoryEntities.add(entity);
//        AttributeEntity entity1 = new AttributeEntity();
//        entity1.setName("Nguyen Van B");
//        entity.setDescription("Demo Unit Test 1");
//        categoryEntities.add(entity1);
//        Mockito.when(attributeDAO.findById(Long.valueOf(0))).thenReturn(Optional.of(entity));
//        assertEquals("Nguyen Van A",entity.getName());
//    }
//
//    @Test
//    public void testFindByIsDeleted() {
//
//        List<AttributeEntity> categoryEntities = new ArrayList<>();
//        Page<AttributeEntity> AttributeEntityPage = new PageImpl<>(categoryEntities);
//        Mockito.when(attributeDAO.findByIsDeleted(false,pageable)).thenReturn(AttributeEntityPage);
//    }
//
//    @Test
//    public void testFindByNameLike() {
//        List<AttributeEntity> categoryEntities = new ArrayList<>();
//        //given
//        AttributeEntity entity = new AttributeEntity();
//        entity.setName("Nguyen Van A");
//        entity.setDescription("Demo Unit Test");
//        categoryEntities.add(entity);
//        AttributeEntity entity1 = new AttributeEntity();
//        entity1.setName("Nguyen Van B");
//        entity.setDescription("Demo Unit Test 1");
//        categoryEntities.add(entity1);
//        Mockito.when(attributeDAO.findByName("Nguyen Van A")).thenReturn(Optional.of(entity));
//        assertEquals("Nguyen Van A",entity.getName());
//    }
}
