package com.brendamareco.portfolio.entities;

import com.brendamareco.portfolio.interfaces.IEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "`hard_skill`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HardSkill implements IEntity<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Pattern(regexp = "^.{1,45}$",
            message = "Name length must be greater than or equal to 1 and" +
                    " less than 45")
    private String name;
    @NotNull
    @Range(min = 0,max = 100)
    private float level;
}
