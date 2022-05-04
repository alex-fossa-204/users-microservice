package by.andersen.laboratory.microservice.users.repository;

import by.andersen.laboratory.microservice.users.model.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void findAllUsersTest() {
        List<Client> users = clientRepository.findAll();
        Assertions.assertNotNull(users);
        users.forEach(System.out::println);
    }

    @Test
    public void findByUidTest() {
        Client client = clientRepository.findByUid(786486841L);
        System.out.println(client);
        Assertions.assertNotNull(client);
    }

}
