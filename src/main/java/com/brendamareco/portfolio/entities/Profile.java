package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`Profile`")
@Getter
@Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String thumbnail;
    @Column(name = "welcome_text")
    String welcomeText;
    String description;
    String role;
    Owner owner;

    public Profile() {}

    public Profile(Long id, String thumbnail, String welcomeText,
                   String description, String role, Owner owner)
    {
        this.id = id;
        this.thumbnail = thumbnail;
        this.welcomeText = welcomeText;
        this.description = description;
        this.role = role;
        this.owner = owner;
    }
}
