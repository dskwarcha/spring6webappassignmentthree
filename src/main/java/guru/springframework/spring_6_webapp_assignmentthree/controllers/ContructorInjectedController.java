package guru.springframework.spring_6_webapp_assignmentthree.controllers;

import guru.springframework.spring_6_webapp_assignmentthree.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// The @Controller says that this is now a spring managed component
@Controller
public class ContructorInjectedController {
    private final GreetingService greetingService;


    // Because we only have this constructor, spring detects that we need to autowire this.
    // The Qualifier bean allows us to better control the wiring. In this case, we are able to tell Spring what service to use.
    // Even though GreetingServicePrimary has a Primary bean, Qualifier bean has priority if specific
    public ContructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
