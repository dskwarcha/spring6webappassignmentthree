package guru.springframework.spring_6_webapp_assignmentthree.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles("EN")
@SpringBootTest
public class myI18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello(){
        System.out.println(myi18NController.sayHello());
    }
}
