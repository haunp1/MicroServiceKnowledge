package vn.com.knowledge.repository;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import vn.com.knowledge.entity.AttributeEntity;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

/**
 * @author ThanhVQ
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class AttributeRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AttributeRepository attributeRepository;

    @Test
    public void testFindByName() {
        List<AttributeEntity> attributeEntity = getAttributeEntity();
        System.out.println(attributeEntity.size());
        AttributeEntity found = attributeRepository.findByName(attributeEntity.get(0).getName()).get();

        assertThat(found.getName())
                .isEqualTo(attributeEntity.get(0).getName());
    }

    @Test
    public void testFindByIsDeleted() {
        List<AttributeEntity> attributeEntity = getAttributeEntity();
        List<AttributeEntity> found = new ArrayList<>();
        found = attributeRepository
                .findByIsDeleted(false, PageRequest.of(0, 10, Sort.Direction.ASC, "name")).getContent();
        assertThat(found.get(0).getName()).isEqualTo(attributeEntity.get(0).getName());
    }


    @Test
    public void testFindAllByIsDeletedAndNameContaining() {
        List<AttributeEntity> attributeEntity = getAttributeEntity();
        List<AttributeEntity> found = attributeRepository
                .findAllByIsDeletedAndNameContaining(false, "thanh", PageRequest.of(0, 10, Sort.Direction.DESC, "name")).getContent();
        assertThat(found.get(0).getName()).isEqualTo(attributeEntity.get(0).getName());
    }

    private List<AttributeEntity> getAttributeEntity() {
        List<AttributeEntity> attributeEntities = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            AttributeEntity attributeEntity = new AttributeEntity();
            attributeEntity.setDescription("data to test");
            attributeEntity.setDeleted(false);
            attributeEntity.setName("thanh"+i);
            entityManager.persist(attributeEntity);
            entityManager.flush();
            attributeEntities.add(attributeEntity);
        }
        return attributeEntities;
    }


}
