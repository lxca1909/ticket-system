package de.lucao.ticket_system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TicketSystemApplication {

    private static final Logger log = LoggerFactory.getLogger(TicketSystemApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(TicketSystemApplication.class, args);
	}

}
