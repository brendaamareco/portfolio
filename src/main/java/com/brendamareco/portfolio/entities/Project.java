package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`project`")
@Getter
@Setter
public class Project
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String thumbnail;
    @Column(name = "`project_url`")
    private String projectUrl;

    public Project() {}

    public Project(Long id, String title, String description,
                   String thumbnail, String projectUrl)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.projectUrl = projectUrl;
    }
}
