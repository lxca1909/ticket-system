package de.lucao.ticket_system.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/status")
    public String status() {
        return HttpStatus.OK.getReasonPhrase();
    }

    @GetMapping("/index")
    public String index() {
        return "index.html";
    }
}
