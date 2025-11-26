package de.lucao.ticket_system;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Component
public class ReadyBanner implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        String banner = """
           _____          _____                                        _________               __                  
          /  _  \\   _____/ ____\\___________     ____   ____   ____    /   _____/__.__. _______/  |_  ____   _____  
         /  /_\\  \\ /    \\   __\\\\_  __ \\__  \\   / ___\\_/ __ \\ /    \\   \\_____  <   |  |/  ___/\\   __\\/ __ \\ /     \\ 
        /    |    \\   |  \\  |   |  | \\/ __ \\_/ /_/  >  ___/|   |  \\  /        \\___  |\\___ \\  |  | \\  ___/|  Y Y  \\
        \\____|__  /___|  /__|   |__|  (____  /\\___  / \\___  >___|  / /_______  / ____/____  > |__|  \\___  >__|_|  /
                \\/     \\/                  \\/_____/      \\/     \\/          \\/\\/         \\/            \\/      \\/ 

        :: Application   :: %s
        :: Spring Boot   :: %s
        :: Java          :: %s
        :: Active Profile:: %s
        """.formatted(
                event.getApplicationContext().getEnvironment().getProperty("spring.application.name", "N/A"),
                event.getSpringApplication().getClass().getPackage().getImplementationVersion(),
                System.getProperty("java.version"),
                event.getApplicationContext().getEnvironment().getProperty("spring.profiles.active", "default")
        );

        System.out.println(banner);
    }
}
