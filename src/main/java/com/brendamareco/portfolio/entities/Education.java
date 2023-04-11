package com.brendamareco.portfolio.entities;

import com.brendamareco.portfolio.embeddables.DateRange;
import com.brendamareco.portfolio.interfaces.IEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@Table(name = "`education`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education implements IEntity<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Pattern(regexp = "^.{1,120}$",
            message = "Institution length must be greater than or equal to 1 and" +
                    " less than 64")
    private String institution;
    @NotBlank
    @Pattern(regexp = "^.{1,120}$",
            message = "Title length must be greater than or equal to 1 and" +
                    " less than 64")
    private String title;

    @Pattern(regexp = "^.{0,1024}$",
            message = "Description length must be less than 64")
    private String description;
    @Pattern(regexp = "^.{0,2048}$",
            message = "Thumbnail length must be less than 64")
    private String thumbnail;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "startDate", column = @Column(name = "`start_date`")),
            @AttributeOverride(name = "endDate", column = @Column(name = "`end_date`"))
    })
    private DateRange dateRange;
}
