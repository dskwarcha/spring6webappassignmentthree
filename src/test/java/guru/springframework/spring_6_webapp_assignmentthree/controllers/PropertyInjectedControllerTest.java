package guru.springframework.spring_6_webapp_assignmentthree.controllers;

import guru.springframework.spring_6_webapp_assignmentthree.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

// SpringBootTest tells Junit that I want the spring context to be loaded
@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;
//    @BeforeEach
//    void setUp(){
//        propertyInjectedController = new PropertyInjectedController();
//        propertyInjectedController.greetingService = new GreetingServiceImpl();
//    }
    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}