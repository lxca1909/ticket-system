package de.lucao.ticket_system.Controller;

import de.lucao.ticket_system.Objects.Request;
import de.lucao.ticket_system.Services.RequestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller <-- is for html answers
public class AnfrageController {

    RequestService requestService;

    public AnfrageController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("/createAnfrage")
    public Request anfrage(@RequestBody Request request) {
        return requestService.createAnfrage(request);
    }
}
