package by.andersen.laboratory.microservice.users.service.impl;

import by.andersen.laboratory.microservice.users.model.Client;
import by.andersen.laboratory.microservice.users.model.dto.ClientDto;
import by.andersen.laboratory.microservice.users.model.dto.ClientDtoMapper;
import by.andersen.laboratory.microservice.users.model.dto.EntityToDtoMapper;
import by.andersen.laboratory.microservice.users.repository.ClientRepository;
import by.andersen.laboratory.microservice.users.service.ClientService;
import by.andersen.laboratory.microservice.users.service.exception.EmptyResultException;
import by.andersen.laboratory.microservice.users.service.exception.ServiceException;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static by.andersen.laboratory.microservice.users.service.constant.ServiceConstant.*;

@Data
@AllArgsConstructor

@Service
@Qualifier("clientService")
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    private ClientDtoMapper clientDtoMapper;

    @Override
    public ClientDto registerClient(ClientDto clientDto) {
        Client client = clientRepository.save(clientDtoMapper.dtoToEntity(clientDto));
        return clientDtoMapper.entityToDto(client);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public List<ClientDto> findAllClients() throws ServiceException {
        List<Client> clients = clientRepository.findAll();
        if (clients == null) {
            throw new EmptyResultException(EMPTY_RESULT_SET_MSG);
        }
        return clientDtoMapper.convertEntityListToDtoList(clients);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public ClientDto findClientByUid(Long uid) throws EmptyResultException {
        Client client = clientRepository.findByUid(uid);
        if (client == null) {
            throw new EmptyResultException(String.format(NO_CLIENT_FOUND_BY_UID, uid));
        }
        return clientDtoMapper.entityToDto(client);
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    @Override
    public ClientDto updateClient(ClientDto client) throws EmptyResultException {
        Client clientToUpdate = clientRepository.findByUid(client.getUid());
        if (clientToUpdate == null) {
            throw new EmptyResultException(String.format(NO_CLIENT_FOUND_BY_UID, client.getUid()));
        }
        if (client.getFirstName() != null) {
            clientToUpdate.setFirstName(client.getFirstName());
        }
        if (client.getLastName() != null) {
            clientToUpdate.setLastName(client.getLastName());
        }
        if (client.getDateOfBirth() != null) {
            clientToUpdate.setDateOfBirth(client.getDateOfBirth());
        }
        return clientDtoMapper.entityToDto(clientToUpdate);
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    @Override
    public ClientDto deleteClient(ClientDto client) throws EmptyResultException {
        Client clientToDelete = clientRepository.findByUid(client.getUid());
        if (clientToDelete == null) {
            throw new EmptyResultException(String.format(NO_CLIENT_FOUND_BY_UID, client.getUid()));
        }
        clientRepository.deleteById(clientToDelete.getId());
        return clientDtoMapper.entityToDto(clientToDelete);
    }
}
