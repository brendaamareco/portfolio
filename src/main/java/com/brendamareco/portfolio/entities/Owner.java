package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "`owner`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Column(name = "last_name")
    String lastName;
    String country;
    String province;
    String thumbnail;
    @Column(name = "welcome_text")
    String welcomeText;
    String description;
    String role;
}
