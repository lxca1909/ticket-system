package de.lucao.ticket_system.Services;

import de.lucao.ticket_system.Objects.User;
import de.lucao.ticket_system.Repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(RequestService.class);

    @Autowired
    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        logger.info("User: {}", user);
        return userRepository.save(user);
    }
}
