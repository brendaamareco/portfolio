package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "skill")
@Getter
@Setter
public class Skill
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    float level;
    @Enumerated(EnumType.STRING)
    SkillType type;

    public Skill() {}

    public Skill(Long id, String name, float level, SkillType type)
    {
        this.id = id;
        this.name = name;
        this.level = level;
        this.type = type;
    }
}
