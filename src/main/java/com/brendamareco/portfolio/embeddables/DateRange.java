package com.brendamareco.portfolio.embeddables;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DateRange
{
    @NotNull
    private Date startDate, endDate;
}
