package guru.springframework.spring_6_webapp_assignmentthree.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// Primary tells Spring Framework which bean should be injected if more than one exists. In this case, two Greeting
// service beans exists for a test running, so one of them had to be given Primary Bean
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean";
    }
}
