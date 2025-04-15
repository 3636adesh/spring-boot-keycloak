package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http,JwtAuthConverter jwtAuthConverter) throws Exception {

         http.csrf(AbstractHttpConfigurer::disable)
                 .authorizeHttpRequests(authz->authz.anyRequest().authenticated());

         http.oauth2ResourceServer(
                    oauth2->oauth2.jwt(jwt->jwt.jwtAuthenticationConverter(jwtAuthConverter))
         );

         http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));


         return http.build();
     }
}
