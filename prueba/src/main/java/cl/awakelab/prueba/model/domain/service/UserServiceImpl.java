package cl.awakelab.prueba.model.domain.service;

import cl.awakelab.prueba.model.persistence.repository.UserRepository;
import cl.awakelab.prueba.web.service.UserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    UserRepository repository;
    public UserServiceImpl(UserRepository repository) {

        this.repository = repository;
    }
    @Override
    public Optional<List<User>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<User> findById(String username) {

        return Optional.empty();
    }

    @Override
    public Optional<User> create(User user) {

        return Optional.empty();
    }

    @Override
    public Optional<User> update(User user) {

        return Optional.empty();
    }

    @Override
    public boolean delete(int id) {

        return false;
    }
}
