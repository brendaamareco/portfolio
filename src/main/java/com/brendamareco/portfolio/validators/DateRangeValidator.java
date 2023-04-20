package com.brendamareco.portfolio.validators;

import com.brendamareco.portfolio.embeddables.DateRange;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateRangeValidator implements ConstraintValidator<ValidDateRange, DateRange>
{
    @Override
    public boolean isValid(DateRange value, ConstraintValidatorContext context)
    {
        return value.getStartDate().before(value.getEndDate())
                || value.getStartDate().equals(value.getEndDate());
    }
}
