package de.lucao.ticket_system;

import de.lucao.ticket_system.Enum.AnfrageType;
import de.lucao.ticket_system.Objects.Anfrage;
import de.lucao.ticket_system.Repositories.AnfrageRepository;
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

    @Bean
    public CommandLineRunner init(AnfrageRepository repository) {
        return args -> {
            Anfrage anfrage1 = new Anfrage("Ich habe ein Problem", "johannes@mail.com", AnfrageType.ISSUE, "2");
            Anfrage anfrage2 = new Anfrage("Ich will neuer Computer", "friedrich@mail.com", AnfrageType.REQUEST, "1");
            Anfrage anfrage3 = new Anfrage("Ich hab Frage", "kast@mail.com", AnfrageType.TICKET, "4");


            repository.save(anfrage1);
            repository.save(anfrage2);
            repository.save(anfrage3);

            log.info("Alle gefundenen Anfragen!");
            log.info("-------------------------");
            repository.findAll().forEach(anfrage -> {
                log.info(anfrage.toString());
            });
            repository.deleteAll();
        };
    }

}
