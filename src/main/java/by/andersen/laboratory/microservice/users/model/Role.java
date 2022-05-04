package by.andersen.laboratory.microservice.users.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Data
@ToString(exclude = {"privileges", "users"})
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_privilege",
            joinColumns = @JoinColumn(name = "role", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "privilege", referencedColumnName = "id")

    )
    private Collection<Privilege> privileges;

    @OneToMany(mappedBy = "role")
    private Collection<Client> users;

}
