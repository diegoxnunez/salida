package cl.awakelab.prueba.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Data public class UserEntity {
    @Id
    private String username;
    private String password;
    private String role;
}
