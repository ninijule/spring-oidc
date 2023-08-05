package fr.beutin.julian.demo.demo.service;


import fr.beutin.julian.demo.demo.entity.User;
import fr.beutin.julian.demo.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getMovie() {
        return userRepository.getMovies();
    }

    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

}
