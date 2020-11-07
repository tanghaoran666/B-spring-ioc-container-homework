package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class GreetingService {
    public GreetingService() {
        System.out.println("new service");
    }

    String sayHi() {
        return "hello world";
    }
}
