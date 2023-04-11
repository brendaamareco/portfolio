package com.brendamareco.portfolio.entities;

import com.brendamareco.portfolio.interfaces.IEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "`experience`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience implements IEntity<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank
    @Pattern(regexp = "^.{1,64}$",
            message = "Title length must be greater than or equal to 1 and" +
                    " less than 64")
    String title;
    @Pattern(regexp = "^.{0,1024}$",
            message = "Description length must be less than 1024")
    String description;
    @Pattern(regexp = "^.{0,2048}$",
            message = "Thumbnail URL length must be less than 2048")
    String thumbnail;
    @Column(name = "`start_date`")
    @NotNull
    Date startDate;
    @Column(name = "`end_date`")
    @NotNull
    Date endDate;
    @Column(name = "`company_name`")
    @NotBlank
    @Pattern(regexp = "^.{1,64}$",
            message = "CompanyName length must be greater than or equal to 1 and" +
                    " less than 64")
    String companyName;
}
