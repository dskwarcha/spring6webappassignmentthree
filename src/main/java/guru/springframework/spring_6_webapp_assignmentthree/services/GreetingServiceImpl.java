package guru.springframework.spring_6_webapp_assignmentthree.services;

import org.springframework.stereotype.Service;

// Note: The @Service spring stereotype tells Spring that this is a Spring component
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service.";
    }
}
