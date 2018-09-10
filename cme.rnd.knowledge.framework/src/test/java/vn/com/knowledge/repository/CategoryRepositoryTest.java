package vn.com.knowledge.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import vn.com.knowledge.entity.CategoryEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

/**
 * @author NhanVT3
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class CategoryRepositoryTest {

//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    @Test
//    public void whenFindByName_thenReturnAttributeEntity() {
//        CategoryEntity test = new CategoryEntity();
//        test.setDescription("Test Repository");
//        test.setDeleted(false);
//        test.setName("Test");
//        entityManager.persist(test);
//        entityManager.flush();
//
//        // when
//        CategoryEntity found = categoryRepository.findByNameLike(test.getName()).get();
//
//        // then
//
//        assertThat(found.getName()).isEqualTo(test.getName());
//    }
}
