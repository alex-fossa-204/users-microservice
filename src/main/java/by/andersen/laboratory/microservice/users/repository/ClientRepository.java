package by.andersen.laboratory.microservice.users.repository;

import by.andersen.laboratory.microservice.users.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByUid(Long uid);

}
