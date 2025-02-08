package org.ejemplosclases.ejercicio1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {
// Se define un filtro de seguridad que desactiva CSRF y permite el acceso a todas las rutas
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Forma moderna de desactivar CSRF
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()); // Permite el acceso a todas las rutas
        return http.build();
    }
}



