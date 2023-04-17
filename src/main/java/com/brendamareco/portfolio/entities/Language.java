package com.brendamareco.portfolio.entities;

import com.brendamareco.portfolio.interfaces.IEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`language`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language implements IEntity<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank
    @Pattern(regexp = "^.{1,45}$",
            message = "Name length must be greater than or equal to 1 and" +
                    " less than 45")
    String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    LanguageLevel level;
}
