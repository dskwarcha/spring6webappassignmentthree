package guru.springframework.spring_6_webapp_assignmentthree.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class EnvironmentServiceDev implements EnvironmentService {

    @Override
    public String getEnv(){
        return "dev";
    }
}
