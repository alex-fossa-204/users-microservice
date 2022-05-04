package by.andersen.laboratory.microservice.users.repository;

import by.andersen.laboratory.microservice.users.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository <Role, Long> {

    Role findRoleByRoleName(String roleName);

}
