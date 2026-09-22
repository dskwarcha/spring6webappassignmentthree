package guru.springframework.spring_6_webapp_assignmentthree.services.i18n;

import guru.springframework.spring_6_webapp_assignmentthree.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// In this lesson, Profile bean allowed us to name two services the same and later use ActiveProfile bean to specify
// which service would like to be used for the controller
// If no other profile is available to use, it will use default profile as long as you specify which is default
@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {return "Hello World - EN";}
}
