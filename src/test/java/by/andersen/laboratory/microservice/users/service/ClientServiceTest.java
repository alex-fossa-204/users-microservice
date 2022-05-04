package by.andersen.laboratory.microservice.users.service;

import by.andersen.laboratory.microservice.users.model.dto.ClientDto;
import by.andersen.laboratory.microservice.users.service.exception.EmptyResultException;
import by.andersen.laboratory.microservice.users.service.exception.ServiceException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ClientServiceTest {

    @Autowired
    private ClientService clientService;

    @Test
    public void findAllTest() throws ServiceException {
        List<ClientDto> clients = clientService.findAllClients();
        Assertions.assertNotNull(clients);
        clients.forEach(System.out::println);
    }

    @Test
    public void findByUidTest() throws EmptyResultException {
        ClientDto clientDto = clientService.findClientByUid(786486841L);
        Assertions.assertNotNull(clientDto);
        System.out.println(clientDto);
    }

}
