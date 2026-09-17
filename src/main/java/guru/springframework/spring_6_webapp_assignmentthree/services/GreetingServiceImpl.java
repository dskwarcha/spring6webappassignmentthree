package guru.springframework.spring_6_webapp_assignmentthree.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service.";
    }
}
