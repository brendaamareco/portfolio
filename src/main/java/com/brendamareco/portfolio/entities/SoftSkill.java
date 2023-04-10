package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "soft_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoftSkill
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
}
