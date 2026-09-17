package guru.springframework.spring_6_webapp_assignmentthree;

import guru.springframework.spring_6_webapp_assignmentthree.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6WebappAssignmentthreeApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring6WebappAssignmentthreeApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In Main Method");

		System.out.println(controller.sayHello());
	}

}
