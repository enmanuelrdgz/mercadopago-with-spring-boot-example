package com.marcomnrq.ecommerce.domain.model;

import java.util.List;
import javax.persistence.*;
import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.NaturalId;

@Data
@Entity
@Table(name ="users")
public class User extends AuditModel {
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    @JsonIgnore
    List<Role> roles;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NaturalId
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean enabled;
}
