package com.safu.flight_tracker_backend.Api;

import org.springframework.web.bind.annotation.RestController;

import com.safu.flight_tracker_backend.Entity.UserDTO;
import com.safu.flight_tracker_backend.Entity.Users;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController("/api")
public class UserApi {

    @PostMapping("/user/register")
    public ResponseEntity<Users> registerUser(@RequestBody UserDTO user) {
        return registerUser(user);
    }
}
