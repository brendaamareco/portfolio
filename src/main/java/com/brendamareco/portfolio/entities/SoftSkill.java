package com.brendamareco.portfolio.entities;

import com.brendamareco.portfolio.interfaces.GeneralEntity;
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
public class SoftSkill implements GeneralEntity<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank(message = "Name is mandatory")
    @Pattern(regexp = "^.{1,44}$",
            message = "Name length must be greater than or equal to 1 and" +
                    " less than or equal to 45")
    String name;
}
