package de.lucao.ticket_system.Controller;

import de.lucao.ticket_system.Objects.Request;
import de.lucao.ticket_system.Services.RequestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller <-- is for html answers
public class RequestController {

    RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("/createRequest")
    public Request request(@RequestBody Request request) {
        return requestService.createRequest(request);
    }
}
