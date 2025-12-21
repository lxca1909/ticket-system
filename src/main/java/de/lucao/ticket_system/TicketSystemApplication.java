package de.lucao.ticket_system;

import de.lucao.ticket_system.Repositories.RequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TicketSystemApplication {

    private static final Logger log = LoggerFactory.getLogger(TicketSystemApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(TicketSystemApplication.class, args);
	}

    @Bean
    public CommandLineRunner init(RequestRepository repository) {
        return args -> {

            //TODO: login impl


            log.info("Application is started!");
        };
    }

}
