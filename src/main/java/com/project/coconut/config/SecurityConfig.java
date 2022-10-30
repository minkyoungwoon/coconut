package com.project.coconut.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public WebSecurityCustomizer configure(){
        return (web) -> web.ignoring().antMatchers(
                "/h2-console/**",
                "/favicon.ico",
                "/error"
        );
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .httpBasic().disable()
                .exceptionHandling()
            .and()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/freeboard/*").permitAll()
                .antMatchers("/freeboard/list").permitAll();
        return http.build();
    }







}
