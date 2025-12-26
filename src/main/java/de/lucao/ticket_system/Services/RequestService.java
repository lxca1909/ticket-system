package de.lucao.ticket_system.Services;

import de.lucao.ticket_system.Objects.Request;
import de.lucao.ticket_system.Repositories.RequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    RequestRepository requestRepository;

    @Autowired
    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    Logger logger = LoggerFactory.getLogger(RequestService.class);

    public Request createRequest(Request request){

        logger.info("Anfrage: {}", request);
        return requestRepository.save(request);
    }
}
