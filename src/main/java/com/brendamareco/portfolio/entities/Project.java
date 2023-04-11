package com.brendamareco.portfolio.entities;

import com.brendamareco.portfolio.interfaces.GeneralEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@Table(name = "`project`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project implements GeneralEntity<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Pattern(regexp = "^.{1,64}$",
            message = "Title length must be greater than or equal to 1 and" +
                    " less than 64")
    private String title;
    @Pattern(regexp = "^.{0,1024}$",
            message = "Description length must be less than 1024")
    private String description;
    @Pattern(regexp = "^.{0,2048}$",
            message = "Thumbnail URL length must be less than 2048")
    private String thumbnail;
    @Column(name = "`project_url`")
    @Pattern(regexp = "^.{0,2048}$",
            message = "Project URL length must be less than 2048")
    private String projectUrl;
}
