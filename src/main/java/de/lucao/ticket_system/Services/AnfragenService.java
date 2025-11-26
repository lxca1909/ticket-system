package de.lucao.ticket_system.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AnfragenService {

    Logger logger = LoggerFactory.getLogger(AnfragenService.class);

    public void test(){
        logger.info("test");
    }
}
