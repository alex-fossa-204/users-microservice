package by.andersen.laboratory.microservice.users.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private String firstName;

    private String lastName;

    private Long uid;

    private Date dateOdBirth;

    private String role;

}
