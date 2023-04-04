package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "`education`")
@Getter
@Setter
public class Education
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String institution;
    String title;
    String description;
    String thumbnail;
    @Column(name = "`start_date`")
    Date startDate;
    @Column(name = "`end_date`")
    Date endDate;

    public Education() {}

    public Education(Long id, String title, String description,
                     String thumbnail, Date startDate, Date endDate)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
