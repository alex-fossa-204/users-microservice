package by.andersen.laboratory.microservice.users.model.dto;

import java.util.List;

public interface EntityToDtoMapper <E, D> {

    D entityToDto(E entity);

    List<D> convertEntityListToDtoList(List<E> entityList);

    E dtoToEntity(D dto);

}
