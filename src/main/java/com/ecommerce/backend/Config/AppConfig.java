//package com.ecommerce.backend.Config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//@Configuration
//@EnableWebSecurity
//public class AppConfig {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf(csrf->csrf.disable())
//                .cors(cors->cors.disable())
//                .authorizeRequests(
//                        auth->  auth.requestMatchers("/api/**").authenticated()
//                                .anyRequest().permitAll())
////                .addFilterBefore(null, UsernamePasswordAuthenticationFilter.class)
//        ;
//        return http.build();
//
//
//    }
//}
