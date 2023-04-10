package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "`experience`")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
