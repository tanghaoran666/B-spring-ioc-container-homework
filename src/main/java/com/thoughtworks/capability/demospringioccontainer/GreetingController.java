package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Scope("singleton")
@RestController
public class GreetingController {

    private final ObjectFactory<GreetingService> greetingService;

    public GreetingController(ObjectFactory<GreetingService> greetingService) {
        System.out.println("new controller");
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetingService.getObject().sayHi();
    }

}
