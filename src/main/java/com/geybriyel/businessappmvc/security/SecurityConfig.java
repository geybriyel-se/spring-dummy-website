package com.geybriyel.businessappmvc.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails level1 = User.builder()
                .username("level1")
                .password("{noop}password")
                .roles("EMPLOYEE")
                .build();
        UserDetails level2 = User.builder()
                .username("level2")
                .password("{noop}password")
                .roles("EMPLOYEE", "MANAGER")
                .build();
        UserDetails level3 = User.builder()
                .username("level3")
                .password("{noop}password")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(level1, level2, level3);
    }
}
