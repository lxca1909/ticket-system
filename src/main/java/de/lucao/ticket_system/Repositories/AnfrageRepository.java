package de.lucao.ticket_system.Repositories;

import de.lucao.ticket_system.Objects.Anfrage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnfrageRepository extends CrudRepository<Anfrage, Long> {

    List<Anfrage> findByAnfrageId(int anfrageId);

    Anfrage findById(long id);
}
