package by.andersen.laboratory.microservice.users.repository;

import by.andersen.laboratory.microservice.users.model.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllUsersTest() {
        List<Client> users = userRepository.findAll();
        Assertions.assertNotNull(users);
        users.forEach(System.out::println);
    }

}
