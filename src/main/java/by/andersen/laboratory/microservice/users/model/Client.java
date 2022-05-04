package by.andersen.laboratory.microservice.users.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString(exclude = {"id"})
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "role")
    private Role role;

    @Column(name = "uid")
    private Long uid;

    public Client(String firstName, String lastName, Date dateOfBirth, Role role, Long uid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.role = role;
        this.uid = uid;
    }
}
