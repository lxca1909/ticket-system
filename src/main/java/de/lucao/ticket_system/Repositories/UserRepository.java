package de.lucao.ticket_system.Repositories;

import de.lucao.ticket_system.Objects.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

}
