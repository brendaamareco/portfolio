package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "`experience`")
@Setter
@Getter
public class Experience
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String description;
    String thumbnail;
    @Column(name = "`start_date`")
    Date startDate;
    @Column(name = "`end_date`")
    Date endDate;
    @Column(name = "`company_name`")
    String companyName;

    public Experience() {}

    public Experience(Long id, String title, String description,
                      String thumbnail, Date startDate, Date endDate,
                      String companyName)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.companyName = companyName;
    }
}
