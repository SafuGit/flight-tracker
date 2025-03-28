package com.safu.flight_tracker_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safu.flight_tracker_backend.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}
