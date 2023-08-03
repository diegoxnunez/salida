package cl.awakelab.prueba.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor
public @Data class UserEntity {
    @Id
    private String username;
    private String password;
    private String role;
}
