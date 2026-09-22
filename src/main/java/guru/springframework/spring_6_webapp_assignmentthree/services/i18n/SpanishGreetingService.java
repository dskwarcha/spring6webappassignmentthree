package guru.springframework.spring_6_webapp_assignmentthree.services.i18n;

import guru.springframework.spring_6_webapp_assignmentthree.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {return "Hola Mundo - ES";}
}
