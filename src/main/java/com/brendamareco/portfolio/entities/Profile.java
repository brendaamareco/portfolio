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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
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

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", thumbnail='" + thumbnail + '\'' +
                ", welcomeText='" + welcomeText + '\'' +
                ", description='" + description + '\'' +
                ", role='" + role + '\'' +
                ", owner=" + owner +
                '}';
    }
}
