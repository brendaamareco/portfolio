package com.brendamareco.portfolio.dto;

import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

public record JwtResponse(@Getter String jwtToken) implements Serializable
{
    @Serial
    private static final long serialVersionUID = -8091879091924046844L;
}
