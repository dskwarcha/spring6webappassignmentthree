package guru.springframework.spring_6_webapp_assignmentthree.controllers;

import guru.springframework.spring_6_webapp_assignmentthree.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// @Controller means now a spring managed component
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    // I think this counts as reflection which is slow. Don't do this unless absolutely necessary. Just use constructors
    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
      return  greetingService.sayGreeting();
    }



}
