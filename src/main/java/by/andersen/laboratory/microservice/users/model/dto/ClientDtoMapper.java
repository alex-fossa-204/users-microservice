package by.andersen.laboratory.microservice.users.model.dto;

import by.andersen.laboratory.microservice.users.model.Client;
import by.andersen.laboratory.microservice.users.model.Role;
import by.andersen.laboratory.microservice.users.repository.ClientRepository;
import by.andersen.laboratory.microservice.users.repository.RoleRepository;
import by.andersen.laboratory.microservice.users.utils.RandomUidGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

@Component
@Qualifier("clientDtoMapper")
public class ClientDtoMapper implements EntityToDtoMapper <Client, ClientDto> {

    private ClientRepository clientRepository;

    private RoleRepository roleRepository;

    private RandomUidGenerator randomUidGenerator;

    private static final String ROLE_USER = "USER";

    @Override
    public ClientDto entityToDto(Client entity) {
        return new ClientDto(entity.getFirstName(), entity.getLastName(), entity.getUid(), entity.getDateOfBirth(), entity.getRole().getRoleName());
    }

    @Override
    public List<ClientDto> convertEntityListToDtoList(List<Client> entityList) {
        List<ClientDto> result = new ArrayList<>();
        entityList.forEach(e -> {
            result.add(entityToDto(e));
        });
        return result;
    }

    @Override
    public Client dtoToEntity(ClientDto dto) {
        Client client = clientRepository.findByUid(dto.getUid());
        if (client == null) {
            client = new Client(dto.getFirstName(), dto.getLastName(), dto.getDateOfBirth(), roleRepository.findRoleByRoleName(ROLE_USER), randomUidGenerator.generateRandomTransferUid());
            System.out.println("ClientDtoMapper: " + client);
        }
        return client;
    }
}
