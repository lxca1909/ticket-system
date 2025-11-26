package de.lucao.ticket_system.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    public HelloWorldController() {
    }

    @GetMapping("/helloWorld")
    public String status() {
        return "Hello ";
    }
}
