package guru.springframework.spring_6_webapp_assignmentthree;

import guru.springframework.spring_6_webapp_assignmentthree.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6WebappAssignmentthreeApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromCtx(){
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}
	@Test
	void contextLoads() {
	}

}
