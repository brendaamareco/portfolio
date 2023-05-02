package com.brendamareco.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import com.brendamareco.portfolio.services.JwtUserDetailsService;


import com.brendamareco.portfolio.config.JwtTokenUtil;
import com.brendamareco.portfolio.dto.JwtRequest;
import com.brendamareco.portfolio.dto.JwtResponse;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600, allowedHeaders = "*")
public class JwtAuthenticationController
{
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtUserDetailsService userDetailsService;

    @PostMapping("/api/auth")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception
    {
        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String password) throws Exception
    {
        try
        { authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password)); }

        catch (DisabledException e)
        { throw new Exception("USER_DISABLED", e); }

        catch (BadCredentialsException e)
        { throw new Exception("INVALID_CREDENTIALS", e); }
    }
}
