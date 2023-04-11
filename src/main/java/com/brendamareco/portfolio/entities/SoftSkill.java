package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @NotBlank(message = "Name is mandatory")
    @Pattern(regexp = "^.{1,44}$")
    String name;
}
