package com.example.commongateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;

import java.net.http.HttpRequest;

@Configuration
//@EnableWebSecurity
public class securityConfig {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity request) throws Exception {
//        request
//                .authorizeHttpRequests(req ->
//                        {
//                            try {
//                                req.requestMatchers("register/**").permitAll().anyRequest().authenticated()
//                                        .and().cors(cors -> cors.disable())
//                                        .csrf(csrf -> csrf.disable())
//                                        .formLogin(Customizer.withDefaults())
//                                        .logout(Customizer.withDefaults());
//                            } catch (Exception e) {
//                                throw new RuntimeException(e);
//                            }
//                        }
//                );
//        return request.build();
//    }

}
