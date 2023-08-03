package cl.awakelab.prueba.model.persistence.repository;

import cl.awakelab.prueba.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<User, String> {
    UserEntity findByUsername(String username);

}
