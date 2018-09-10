package vn.com.knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import vn.com.knowledge.dao.impl.AttributeDAOImpl;
import vn.com.knowledge.endpoint.ImageEndPoint;
import vn.com.knowledge.repository.AttributeRepository;

/**
 * @author LocLD1
 *
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = ImageEndPoint.class )
public class KnowledgeApp {

	public static void main(String[] args) {
		SpringApplication.run(KnowledgeApp.class, args);
	}
}