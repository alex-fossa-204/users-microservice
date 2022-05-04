package by.andersen.laboratory.microservice.users.controller;

import by.andersen.laboratory.microservice.users.model.dto.ClientDto;
import by.andersen.laboratory.microservice.users.service.ClientService;
import by.andersen.laboratory.microservice.users.service.exception.EmptyResultException;
import by.andersen.laboratory.microservice.users.service.exception.ServiceException;
import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@Data
@AllArgsConstructor

@RestController
public class UserController extends ErrorControllerHandler {

    private ClientService clientService;

    @GetMapping("/client/get/list")
    public ResponseEntity<List<ClientDto>> getAllClients() throws ServiceException {
        List<ClientDto> clients = clientService.findAllClients();
        return new ResponseEntity<>(clients, OK);
    }

    @GetMapping("/client/get/by/uid/{uid}")
    public ResponseEntity<ClientDto> getClientByUid(@PathVariable("uid") Long uid) throws EmptyResultException {
        ClientDto client = clientService.findClientByUid(uid);
        return new ResponseEntity<>(client, OK);
    }

    @PostMapping("/client/register")
    public ResponseEntity<ClientDto> registerNewClient(@RequestBody ClientDto newClient) {
        ClientDto client = clientService.registerClient(newClient);
        return new ResponseEntity<>(client, OK);
    }

    @PatchMapping("/client/update")
    public ResponseEntity<ClientDto> updateNewClient(@RequestBody ClientDto updateClient) throws EmptyResultException {
        ClientDto client = clientService.updateClient(updateClient);
        return new ResponseEntity<>(client, OK);
    }

    @DeleteMapping("/client/delete")
    public ResponseEntity<ClientDto> deleteClient(@RequestBody ClientDto deleteClient) throws EmptyResultException {
        ClientDto client = clientService.deleteClient(deleteClient);
        return new ResponseEntity<>(client, OK);
    }


}
