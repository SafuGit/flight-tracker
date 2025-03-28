package com.safu.flight_tracker_backend.Entity;

import lombok.Data;

@Data
public class UserDTO {
    private long id;

    private String name;

    private String email;

    private String password;
}
