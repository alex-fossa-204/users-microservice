package by.andersen.laboratory.microservice.users.service;

import by.andersen.laboratory.microservice.users.model.dto.ClientDto;
import by.andersen.laboratory.microservice.users.service.exception.EmptyResultException;
import by.andersen.laboratory.microservice.users.service.exception.ServiceException;

import java.util.List;

public interface ClientService {

    ClientDto registerClient(ClientDto clientDto);

    List<ClientDto> findAllClients() throws ServiceException;

    ClientDto findClientByUid(Long uid) throws EmptyResultException;

    ClientDto updateClient(ClientDto client) throws EmptyResultException;

    ClientDto deleteClient(ClientDto client) throws EmptyResultException;

}
