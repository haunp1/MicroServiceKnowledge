package vn.com.knowledge.service.impl;

import org.junit.Assert;
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
import vn.com.knowledge.converter.VendorConverter;
import vn.com.knowledge.dao.VendorDAO;
import vn.com.knowledge.dto.VendorDTO;
import vn.com.knowledge.entity.VendorEntity;
//import vn.com.knowledge.dao.VendorDTO;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@ComponentScan(value = "vn.com.knowledge.converter")
@ContextConfiguration(classes = VendorServiceImplTest.class, loader = AnnotationConfigContextLoader.class)
public class VendorServiceImplTest {

    @Mock
    VendorDAO vendorDAO;
    @Autowired
    @Qualifier("vendorConverter")
    VendorConverter vendorConverter;
    @InjectMocks
    VendorServiceImpl vendorService;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void addOrUpdate() {
        VendorEntity vendorEntity = new VendorEntity();
        vendorEntity.setName("Test");
        vendorEntity.setDescription("Test Service");
        Mockito.when(vendorDAO.addOrUpdate(vendorEntity)).thenReturn(vendorEntity);
        VendorDTO vendorDTO = vendorConverter.convertToDTO(vendorEntity);
        VendorDTO vendorDTOResult = vendorService.addOrUpdate(vendorDTO);
        assertEquals("Test",vendorDTOResult.getName());
    }

    @Test
    public void add() {
        VendorEntity vendorEntity1 = new VendorEntity();
        vendorEntity1.setName("Test1");
        vendorEntity1.setDescription("Test Service");
        Mockito.when(vendorDAO.addOrUpdate(vendorEntity1)).thenReturn(vendorEntity1);
        VendorDTO vendorDTO1 = vendorConverter.convertToDTO(vendorEntity1);
        VendorDTO vendorDTOResult1 = vendorService.addOrUpdate(vendorDTO1);
        Assert.assertEquals("Test",vendorDTOResult1.getName());
    }

    @Test
    public void findAll() {
    }

    @Test
    public void deleteById() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void findByNameLike() {
    }
}