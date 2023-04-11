package com.brendamareco.portfolio.entities;

import com.brendamareco.portfolio.interfaces.IEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@Table(name = "`owner`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner implements IEntity<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank
    @Pattern(regexp = "^.{1,64}$",
            message = "Name length must be greater than or equal to 1 and" +
                    " less than 64")
    String name;
    @Column(name = "last_name")
    @NotBlank
    @Pattern(regexp = "^.{1,64}$",
            message = "LastName length must be greater than or equal to 1 and" +
                    " less than 64")
    String lastName;
    @NotBlank
    @Pattern(regexp = "^.{1,45}$",
            message = "Country length must be greater than or equal to 1 and" +
                    " less than 45")
    String country;
    @NotBlank
    @Pattern(regexp = "^.{1,45}$",
            message = "Province length must be greater than or equal to 1 and" +
                    " less than 45")
    String province;
    @Pattern(regexp = "^.{0,2048}$",
            message = "Thumbnail URL length must be less than 2048")
    String thumbnail;
    @Column(name = "welcome_text")
    @Pattern(regexp = "^.{0,1024}$",
            message = "Welcome text length must be less than 1024")
    String welcomeText;
    @Pattern(regexp = "^.{0,1024}$",
            message = "Description length must be less than 1024")
    String description;
    @NotBlank
    @Pattern(regexp = "^.{1,45}$",
            message = "Role length must be greater than or equal to 1 and" +
                    " less than 45")
    String role;
}
