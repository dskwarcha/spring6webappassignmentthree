package guru.springframework.spring_6_webapp_assignmentthree.controllers;

import guru.springframework.spring_6_webapp_assignmentthree.services.GreetingService;
import org.springframework.stereotype.Controller;

// The @Controller says that this is now a spring managed component
@Controller
public class ContructorInjectedController {
    private final GreetingService greetingService;


    // Because we only have this constructor, spring detects that we need to autowire this.
    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
