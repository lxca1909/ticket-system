package de.lucao.ticket_system.Repositories;

import de.lucao.ticket_system.Objects.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {

    //List<Request> findByRequestId(int anfrageId);

    Request findById(long id);
}
