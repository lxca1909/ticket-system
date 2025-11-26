package de.lucao.ticket_system.Controller;

import de.lucao.ticket_system.Services.AnfragenService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller <-- is for html answers
public class AnfrageController {

    AnfragenService anfragenService;
    public AnfrageController(AnfragenService anfragenService) {
        this.anfragenService = anfragenService;
    }

    @GetMapping("/testAnfrage")
    public String anfrage() {
        this.anfragenService.test();
        return "OK";
    }
}
