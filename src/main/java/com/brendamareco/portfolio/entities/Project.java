package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "`project`")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
