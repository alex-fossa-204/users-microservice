package by.andersen.laboratory.microservice.users.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Data
@ToString(exclude = {"roles"})
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "privilege")
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "privilege")
    private String privilegeName;

    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles;

}
