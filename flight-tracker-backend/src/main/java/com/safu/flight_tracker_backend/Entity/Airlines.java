package com.safu.flight_tracker_backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "airlines")
@Data
public class Airlines {
    @Id
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;
}
