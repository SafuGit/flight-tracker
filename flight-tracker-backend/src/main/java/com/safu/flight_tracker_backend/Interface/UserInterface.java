package com.safu.flight_tracker_backend.Interface;

import org.springframework.http.ResponseEntity;

import com.safu.flight_tracker_backend.Entity.UserDTO;
import com.safu.flight_tracker_backend.Entity.Users;

public interface UserInterface {
    public ResponseEntity<Users> registerUser(UserDTO user);
} 
