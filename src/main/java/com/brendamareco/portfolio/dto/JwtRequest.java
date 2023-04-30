package com.brendamareco.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
public class JwtRequest implements Serializable
{
    @Serial
    private static final long serialVersionUID = 5926468583005150707L;
    @Setter @Getter
    private String username;
    @Setter @Getter
    private String password;

    public JwtRequest(String username, String password)
    {
        this.setUsername(username);
        this.setPassword(password);
    }
}