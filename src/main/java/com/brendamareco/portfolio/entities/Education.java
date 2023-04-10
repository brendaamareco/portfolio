package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "`education`")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
