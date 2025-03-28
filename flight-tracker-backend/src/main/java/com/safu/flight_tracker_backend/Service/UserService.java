package com.safu.flight_tracker_backend.Service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.safu.flight_tracker_backend.Entity.UserDTO;
import com.safu.flight_tracker_backend.Entity.Users;
import com.safu.flight_tracker_backend.Interface.UserInterface;
import com.safu.flight_tracker_backend.Repository.UserRepository;

@Service
public class UserService implements UserInterface {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity<Users> registerUser(UserDTO user) {
        Optional<Users> userOpt = userRepository.findById(user.getId());
        if (userOpt.isPresent()) {
            return ResponseEntity.badRequest().build();
        } else {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            Users newUser = new Users(user.getId(), user.getName(), user.getEmail(), encoder.encode(user.getPassword()));
            userRepository.save(newUser);
            return ResponseEntity.ok(newUser);
        }
    }

}
